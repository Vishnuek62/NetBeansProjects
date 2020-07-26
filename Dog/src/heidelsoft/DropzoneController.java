package heidelsoft;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the controller for the DropZone Web Page The drop ZonePage provides
 * an area where the user can drag an drop multiple files at once These files
 * are then uploaded to the online archiving service. The user often uploads
 * more than 150 files at once.
 *
 * @author
 * @since 25 Feb 2018
 * @version 1.0
 */
public class DropzoneController {

    /**
     * archives a file on the remote service
     *
     * @param fileName as String
     * @param Base64Data as String
     * @param fileSize as long
     * @return ArchiveResult
     */
    @RemoteAction
    public ArchiveResult archiveFile(final String fileName,final String Base64Data,final long fileSize) {

        final boolean flag = checkAvaliableStorage(fileSize);
        if (flag) {
            MyDto.NewFileVersion newFileArchive = new MyDto.NewFileVersion();
            setValuesIntoFileArchive(newFileArchive, fileName, Base64Data);
            RestClient restClient = new RestClient();
            MyEnums.FileArchiveStatus result = null;
            try {
                result = restClient.archiveFile(JSON.serialize(newFileArchive), Helper.getTechnicalUserParam());
                return setArchiveStatus(result);
            } catch (Exception e) {
                ArchiveResult archiveResultJson = new ArchiveResult(result, Label.FileUploadError);
                return archiveResultJson;
            }
        }
        return new ArchiveResult();
    }

    /**
     * write a log entry for each uploaded file and we can add new properties of
     * uploaded file in FileUploadLogEntryDTO
     *
     * @param fnames as List
     * @return List which contains FileUploadLogEntryDTO
     */
    public static List<FileUploadLogEntryDTO> logFiles(List<String> fnames) {
        List<FileUploadLogEntryDTO> fileUploadLogEntryDTOList = new ArrayList<>();
        fnames.stream().forEach(uploadedFileName -> {
            FileUploadLogEntryDTO logEntry = new FileUploadLogEntryDTO();
            logEntry.setName(uploadedFileName);
            fileUploadLogEntryDTOList.add(logEntry);
        });
        return fileUploadLogEntryDTOList;
    }

    /**
     * In case file was archived check/set ArchiveId field
     *
     * @param result as MyEnums.FileArchiveStatus
     * @return ArchiveResult
     */
    private ArchiveResult setArchiveStatus(MyEnums.FileArchiveStatus result) {
        if (result == MyEnums.FileArchiveStatus.created) {
            // Upload message for user according to archiving status
            ArchiveResult archiveResultJson = new ArchiveResult(result, Label.FileArchived);
            return archiveResultJson;
        } else if (result == MyEnums.FileArchiveStatus.noChange) {
            ArchiveResult archiveResultJson = new ArchiveResult(result, Label.FileNoChange);
            return archiveResultJson;
        } else if (result == MyEnums.FileArchiveStatus.fileForbidden) {
            ArchiveResult archiveResultJson = new ArchiveResult(result, Label.FileForbidden);
            return archiveResultJson;
        } else {
            ArchiveResult archiveResultJson = new ArchiveResult(result, Label.FileUploadError);
            return archiveResultJson;
        }
    }

    /**
     * In case file was archived check/set ArchiveId field
     *
     * @param result as MyEnums.FileArchiveStatus
     * @return ArchiveResult
     */
    private void setValuesIntoFileArchive(MyDto.NewFileVersion newFileArchive,final String fileName,final String Base64Data) {
        newFileArchive.task = new MyDto.Task();
        newFileArchive.task.type = Constants.ARCHIVE_TYPE;
        newFileArchive.file = new MyDto.FileProperty();
        newFileArchive.file.href = fileName;
        newFileArchive.file.data = Base64Data;
        newFileArchive.fields = new ArrayList<MyDto.ArchiveField>();

        // Empty strings not allowed by Remote Server
        newFileArchive.fields.add(new MyDto.ArchiveField(Constants._CATEGORY_FIELD, ' '));
        newFileArchive.fields.add(new MyDto.ArchiveField(Constants._STATE_FIELD, ' '));
        newFileArchive.fields.add(new MyDto.ArchiveField(Constants._VERSION_COMMENT_FIELD, ' '));
    }

    /**
     * check avaliable storage with uploaded file
     *
     * @param fileSize as long
     * @return true or false
     */
    private boolean checkAvaliableStorage(final long fileSize) {
        final boolean flag = false;
        AdminController adminController = new AdminController();
        SystemStatusWrapper dto = adminController.systemStatus;
        if (Integer.parseInt(dto.getAvailableStorage()) > fileSize) {
            return true;
        }
        return flag;
    }
}
