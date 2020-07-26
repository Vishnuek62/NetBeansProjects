/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heidelsoft;

import java.io.Serializable;

/**
 * This dto class containes the result of the remote REST Call retrieving the SystemStatus
 * 
 * @author Vishnu EK
 */
public class SystemStatusWrapper implements Serializable{

    private String storageStatus;

    private double usedStorage;

    private String availableStorage;
    
    private MyEnums.ArchiveStatus status;

    public String getStorageStatus() {
        return storageStatus;
    }

    public void setStorageStatus(String storageStatus) {
        this.storageStatus = storageStatus;
    }

    public double getUsedStorage() {
        return usedStorage;
    }

    public void setUsedStorage(double usedStorage) {
        this.usedStorage = usedStorage;
    }

    public String getAvailableStorage() {
        return availableStorage;
    }

    public void setAvailableStorage(String availableStorage) {
        this.availableStorage = availableStorage;
    }

    public MyEnums.ArchiveStatus getStatus() {
        return status;
    }

    public void setStatus(MyEnums.ArchiveStatus status) {
        this.status = status;
    }
}
