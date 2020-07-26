/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heidelsoft;

import java.io.Serializable;

/**
 * This class is used to set Archive Status into Object
 * 
 * @author Vishnu EK
 */
public class ArchiveResult implements Serializable{

    private MyEnums.FileArchiveStatus status;

    private String message;

    public ArchiveResult() {
    }
    
    public ArchiveResult(MyEnums.FileArchiveStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public MyEnums.FileArchiveStatus getStatus() {
        return status;
    }

    public void setStatus(MyEnums.FileArchiveStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    

}
