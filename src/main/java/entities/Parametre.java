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
@Table(name = "parametre")
@NamedQueries({
    @NamedQuery(name = "Parametre.findAll", query = "SELECT p FROM Parametre p"),
    @NamedQuery(name = "Parametre.findByIdParametre", query = "SELECT p FROM Parametre p WHERE p.idParametre = :idParametre"),
    @NamedQuery(name = "Parametre.findByStructure", query = "SELECT p FROM Parametre p WHERE p.structure = :structure"),
    @NamedQuery(name = "Parametre.findByDescription", query = "SELECT p FROM Parametre p WHERE p.description = :description"),
    @NamedQuery(name = "Parametre.findByAdresse", query = "SELECT p FROM Parametre p WHERE p.adresse = :adresse"),
    @NamedQuery(name = "Parametre.findByContact", query = "SELECT p FROM Parametre p WHERE p.contact = :contact"),
    @NamedQuery(name = "Parametre.findByLocalite", query = "SELECT p FROM Parametre p WHERE p.localite = :localite"),
    @NamedQuery(name = "Parametre.findByDossierPartage", query = "SELECT p FROM Parametre p WHERE p.dossierPartage = :dossierPartage")})
public class Parametre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idParametre")
    private Integer idParametre;
    @Basic(optional = false)
    @Column(name = "structure")
    private String structure;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "adresse")
    private String adresse;
    @Basic(optional = false)
    @Column(name = "contact")
    private String contact;
    @Basic(optional = false)
    @Column(name = "localite")
    private String localite;
    @Column(name = "DossierPartage")
    private String dossierPartage;

    public Parametre() {
    }

    public Parametre(Integer idParametre) {
        this.idParametre = idParametre;
    }

    public Parametre(Integer idParametre, String structure, String description, String adresse, String contact, String localite) {
        this.idParametre = idParametre;
        this.structure = structure;
        this.description = description;
        this.adresse = adresse;
        this.contact = contact;
        this.localite = localite;
    }

    public Integer getIdParametre() {
        return idParametre;
    }

    public void setIdParametre(Integer idParametre) {
        this.idParametre = idParametre;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocalite() {
        return localite;
    }

    public void setLocalite(String localite) {
        this.localite = localite;
    }

    public String getDossierPartage() {
        return dossierPartage;
    }

    public void setDossierPartage(String dossierPartage) {
        this.dossierPartage = dossierPartage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParametre != null ? idParametre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametre)) {
            return false;
        }
        Parametre other = (Parametre) object;
        if ((this.idParametre == null && other.idParametre != null) || (this.idParametre != null && !this.idParametre.equals(other.idParametre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Parametre[ idParametre=" + idParametre + " ]";
    }
    
}
