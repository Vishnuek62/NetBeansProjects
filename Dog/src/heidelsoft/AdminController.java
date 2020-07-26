package heidelsoft;

import java.util.Objects;

/**
 * A Controller for the Administration Visual Force Page Handles all server side
 * Controller logic of the Page The Administration Page shows the current state
 * of the connection to the archive this includes: - available storage in the
 * archive - used storage in the archive
 *
 * @author
 * @since 25 Feb 2018
 * @version 1.0
 */
public class AdminController {

    public SystemStatusWrapper systemStatus;
    public String trafficLightColorActive;
    private DtoParser dtoParser = new DtoParser();
    private RestClient restClient;
    private String clturl;
    private static final String activeClass = "active";
    private static final String EMPTY_STRING = "";

    
    public AdminController() {
        systemStatus = new SystemStatusWrapper();
        CredentialsService credentialsManager = new CredentialsManager();
        setClturl(credentialsManager.getTechnicalUser().EndPoint__c);
        updateArchiveStatus();
    }

    /**
     * Retrieves the status from an external Service over an REST API pageCtx is
     * a contexObject that stores e.g. Messages that will be displayed on the
     * Resulting Page
     * 
     */
    private void updateArchiveStatus() {
        setDefaultValues();
        restClient = new RestClient();
        String statusResult = EMPTY_STRING;

        try {
            statusResult = restClient.getFullStatus();
        } catch (CalloutException e) {
            pageCtx.addmessage(new MessageFactory.Message(MessageFactory.Severity.Error, "issue_with_the_remote_server"));
            return;
        } catch (HTTPException e) {
            pageCtx.addmessage(new MessageFactory.Message(MessageFactory.Severity.Error, "Communication_Error"));
            return;
        } catch (TechnicalUserNotSetException e) {
            pageCtx.addmessage(new MessageFactory.Message(MessageFactory.Severity.Error, "TechnicalUserNotSet"));
            return;
        } catch (Customer410Exception e) {
            pageCtx.addmessage(new MessageFactory.Message(MessageFactory.Severity.Error, "NoResourceFoundExceptionMessage"));
            return;
        } catch (Exception e) {
            pageCtx.addmessage(new MessageFactory.Message(MessageFactory.Severity.Error, "Communication_Error"));
            return;
        }
        setSystemStatusWrapperFromRestClient(statusResult);

    }

    /**
     * Render red light on the Administration Page
     */
    public String getIsRedActive() {
        if (Objects.nonNull(systemStatus.getStatus()) && systemStatus.getStatus() == MyEnums.ArchiveStatus.RED) {
            return activeClass;
        }
        return EMPTY_STRING;
    }

    /**
     * Render yellow light on the Administration Page
     */
    public String getIsYellowActive() {
        if (Objects.nonNull(systemStatus.getStatus()) && systemStatus.getStatus() == MyEnums.ArchiveStatus.YELLOW) {
            return activeClass;
        }
        return EMPTY_STRING;
    }

    /**
     * Render green light on the Administration Page
     */
    public String getIsGreenActive() {
        if (Objects.nonNull(systemStatus.getStatus()) && systemStatus.getStatus() == MyEnums.ArchiveStatus.GREEN) {
            return activeClass;
        }
        return EMPTY_STRING;
    }

    /**
     * set default values to SystemStatusWrapper object
     */
    private void setDefaultValues() {
        this.systemStatus.setAvailableStorage("0");
        this.systemStatus.setUsedStorage(0.0);
        this.systemStatus.setStorageStatus(Label.Disconnected);
        this.systemStatus.setStatus(MyEnums.ArchiveStatus.RED);
    }

    /**
     * set values from RestClient call getFullStatus to SystemStatusWrapper object
     * 
     * @param statusResult as String 
     */
    private void setSystemStatusWrapperFromRestClient(String statusResult) {
        if (Objects.nonNull(statusResult) && !statusResult.isEmpty()) {
            MyDto.SystemInformation systemStatusDto = this.dtoParser.parseSystemStatus(statusResult);
            this.systemStatus.setUsedStorage(systemStatusDto.status.storageSizeUsed);
            if (Objects.nonNull(systemStatusDto.status.storageSizeAvailable)) {
                this.systemStatus.setAvailableStorage(String.valueOf(systemStatusDto.status.storageSizeAvailable));
            } else {
                this.systemStatus.setAvailableStorage(Label.NoLimit);
            }
            this.systemStatus.setStorageStatus(systemStatusDto.status.statusText);
            this.systemStatus.setStatus(MyEnums.fromStringArchiveStatus(systemStatusDto.status.state));
        }
    }
}
