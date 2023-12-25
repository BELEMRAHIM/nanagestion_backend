/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "droit")
@NamedQueries({
    @NamedQuery(name = "Droit.findAll", query = "SELECT d FROM Droit d"),
    @NamedQuery(name = "Droit.findByIddroit", query = "SELECT d FROM Droit d WHERE d.iddroit = :iddroit"),
    @NamedQuery(name = "Droit.findByDescription", query = "SELECT d FROM Droit d WHERE d.description = :description"),
    @NamedQuery(name = "Droit.findByCommentaire", query = "SELECT d FROM Droit d WHERE d.commentaire = :commentaire")})
public class Droit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddroit")
    private Integer iddroit;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "commentaire")
    private String commentaire;

    public Droit() {
    }

    public Droit(Integer iddroit) {
        this.iddroit = iddroit;
    }

    public Droit(Integer iddroit, String description, String commentaire) {
        this.iddroit = iddroit;
        this.description = description;
        this.commentaire = commentaire;
    }

    public Integer getIddroit() {
        return iddroit;
    }

    public void setIddroit(Integer iddroit) {
        this.iddroit = iddroit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddroit != null ? iddroit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Droit)) {
            return false;
        }
        Droit other = (Droit) object;
        if ((this.iddroit == null && other.iddroit != null) || (this.iddroit != null && !this.iddroit.equals(other.iddroit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Droit[ iddroit=" + iddroit + " ]";
    }
    
}
