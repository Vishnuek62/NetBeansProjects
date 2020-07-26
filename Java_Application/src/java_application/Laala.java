/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java_application;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vishnu EK
 */
@Entity
@Table(name = "laala")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Laala.findAll", query = "SELECT l FROM Laala l"),
    @NamedQuery(name = "Laala.findByUser", query = "SELECT l FROM Laala l WHERE l.user = :user"),
    @NamedQuery(name = "Laala.findByPass", query = "SELECT l FROM Laala l WHERE l.pass = :pass")})
public class Laala implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "User")
    private String user;
    @Basic(optional = false)
    @Column(name = "pass")
    private String pass;

    public Laala() {
    }

    public Laala(String user) {
        this.user = user;
    }

    public Laala(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (user != null ? user.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Laala)) {
            return false;
        }
        Laala other = (Laala) object;
        if ((this.user == null && other.user != null) || (this.user != null && !this.user.equals(other.user))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "java_application.Laala[ user=" + user + " ]";
    }
    
}
