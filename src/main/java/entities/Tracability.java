/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "tracability")
@NamedQueries({
    @NamedQuery(name = "Tracability.findAll", query = "SELECT t FROM Tracability t"),
    @NamedQuery(name = "Tracability.findByCode", query = "SELECT t FROM Tracability t WHERE t.code = :code"),
    @NamedQuery(name = "Tracability.findByLogin", query = "SELECT t FROM Tracability t WHERE t.login = :login"),
    @NamedQuery(name = "Tracability.findByDescription", query = "SELECT t FROM Tracability t WHERE t.description = :description"),
    @NamedQuery(name = "Tracability.findByDates", query = "SELECT t FROM Tracability t WHERE t.dates = :dates"),
    @NamedQuery(name = "Tracability.findByGroupe", query = "SELECT t FROM Tracability t WHERE t.groupe = :groupe")})
public class Tracability implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "code")
    private Integer code;
    @Column(name = "login")
    private String login;
    @Column(name = "description")
    private String description;
    @Column(name = "dates")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dates;
    @Column(name = "groupe")
    private String groupe;

    public Tracability() {
    }

    public Tracability(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tracability)) {
            return false;
        }
        Tracability other = (Tracability) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tracability[ code=" + code + " ]";
    }
    
}
