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
@Table(name = "profildroit")
@NamedQueries({
    @NamedQuery(name = "Profildroit.findAll", query = "SELECT p FROM Profildroit p"),
    @NamedQuery(name = "Profildroit.findByIdprofildroit", query = "SELECT p FROM Profildroit p WHERE p.idprofildroit = :idprofildroit"),
    @NamedQuery(name = "Profildroit.findByIdprofil", query = "SELECT p FROM Profildroit p WHERE p.idprofil = :idprofil"),
    @NamedQuery(name = "Profildroit.findByIddroit", query = "SELECT p FROM Profildroit p WHERE p.iddroit = :iddroit"),
    @NamedQuery(name = "Profildroit.findByAfficher", query = "SELECT p FROM Profildroit p WHERE p.afficher = :afficher"),
    @NamedQuery(name = "Profildroit.findByModifier", query = "SELECT p FROM Profildroit p WHERE p.modifier = :modifier"),
    @NamedQuery(name = "Profildroit.findBySupprimer", query = "SELECT p FROM Profildroit p WHERE p.supprimer = :supprimer"),
    @NamedQuery(name = "Profildroit.findByImprimer", query = "SELECT p FROM Profildroit p WHERE p.imprimer = :imprimer")})
public class Profildroit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprofildroit")
    private Integer idprofildroit;
    @Basic(optional = false)
    @Column(name = "idprofil")
    private int idprofil;
    @Basic(optional = false)
    @Column(name = "iddroit")
    private int iddroit;
    @Basic(optional = false)
    @Column(name = "afficher")
    private boolean afficher;
    @Basic(optional = false)
    @Column(name = "modifier")
    private boolean modifier;
    @Basic(optional = false)
    @Column(name = "supprimer")
    private boolean supprimer;
    @Basic(optional = false)
    @Column(name = "imprimer")
    private boolean imprimer;

    public Profildroit() {
    }

    public Profildroit(Integer idprofildroit) {
        this.idprofildroit = idprofildroit;
    }

    public Profildroit(Integer idprofildroit, int idprofil, int iddroit, boolean afficher, boolean modifier, boolean supprimer, boolean imprimer) {
        this.idprofildroit = idprofildroit;
        this.idprofil = idprofil;
        this.iddroit = iddroit;
        this.afficher = afficher;
        this.modifier = modifier;
        this.supprimer = supprimer;
        this.imprimer = imprimer;
    }

    public Integer getIdprofildroit() {
        return idprofildroit;
    }

    public void setIdprofildroit(Integer idprofildroit) {
        this.idprofildroit = idprofildroit;
    }

    public int getIdprofil() {
        return idprofil;
    }

    public void setIdprofil(int idprofil) {
        this.idprofil = idprofil;
    }

    public int getIddroit() {
        return iddroit;
    }

    public void setIddroit(int iddroit) {
        this.iddroit = iddroit;
    }

    public boolean getAfficher() {
        return afficher;
    }

    public void setAfficher(boolean afficher) {
        this.afficher = afficher;
    }

    public boolean getModifier() {
        return modifier;
    }

    public void setModifier(boolean modifier) {
        this.modifier = modifier;
    }

    public boolean getSupprimer() {
        return supprimer;
    }

    public void setSupprimer(boolean supprimer) {
        this.supprimer = supprimer;
    }

    public boolean getImprimer() {
        return imprimer;
    }

    public void setImprimer(boolean imprimer) {
        this.imprimer = imprimer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprofildroit != null ? idprofildroit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profildroit)) {
            return false;
        }
        Profildroit other = (Profildroit) object;
        if ((this.idprofildroit == null && other.idprofildroit != null) || (this.idprofildroit != null && !this.idprofildroit.equals(other.idprofildroit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Profildroit[ idprofildroit=" + idprofildroit + " ]";
    }
    
}
