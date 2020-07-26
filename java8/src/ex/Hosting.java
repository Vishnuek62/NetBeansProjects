/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

/**
 *
 * @author Vishnu EK
 */
public class Hosting {
    
    private int Id;
    private String name;
    private long websites;

    public Hosting(int Id, String name, long websites) {
        this.Id = Id;
        this.name = name;
        this.websites = websites;
    }

    
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWebsites() {
        return websites;
    }

    public void setWebsites(long websites) {
        this.websites = websites;
    }
    
    
    
}
