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
@Table(name = "paiementfournisseur")
@NamedQueries({
    @NamedQuery(name = "Paiementfournisseur.findAll", query = "SELECT p FROM Paiementfournisseur p"),
    @NamedQuery(name = "Paiementfournisseur.findByIdpaiement", query = "SELECT p FROM Paiementfournisseur p WHERE p.idpaiement = :idpaiement"),
    @NamedQuery(name = "Paiementfournisseur.findByIduser", query = "SELECT p FROM Paiementfournisseur p WHERE p.iduser = :iduser"),
    @NamedQuery(name = "Paiementfournisseur.findByIdfournisseur", query = "SELECT p FROM Paiementfournisseur p WHERE p.idfournisseur = :idfournisseur"),
    @NamedQuery(name = "Paiementfournisseur.findByMontant", query = "SELECT p FROM Paiementfournisseur p WHERE p.montant = :montant"),
    @NamedQuery(name = "Paiementfournisseur.findByModepaiement", query = "SELECT p FROM Paiementfournisseur p WHERE p.modepaiement = :modepaiement"),
    @NamedQuery(name = "Paiementfournisseur.findByDatepaiement", query = "SELECT p FROM Paiementfournisseur p WHERE p.datepaiement = :datepaiement"),
    @NamedQuery(name = "Paiementfournisseur.findByEtat", query = "SELECT p FROM Paiementfournisseur p WHERE p.etat = :etat"),
    @NamedQuery(name = "Paiementfournisseur.findByIdapprov", query = "SELECT p FROM Paiementfournisseur p WHERE p.idapprov = :idapprov")})
public class Paiementfournisseur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpaiement")
    private Integer idpaiement;
    @Basic(optional = false)
    @Column(name = "iduser")
    private int iduser;
    @Basic(optional = false)
    @Column(name = "idfournisseur")
    private int idfournisseur;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montant")
    private Double montant;
    @Column(name = "modepaiement")
    private String modepaiement;
    @Column(name = "datepaiement")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datepaiement;
    @Column(name = "etat")
    private Short etat;
    @Basic(optional = false)
    @Column(name = "idapprov")
    private int idapprov;

    public Paiementfournisseur() {
    }

    public Paiementfournisseur(Integer idpaiement) {
        this.idpaiement = idpaiement;
    }

    public Paiementfournisseur(Integer idpaiement, int iduser, int idfournisseur, int idapprov) {
        this.idpaiement = idpaiement;
        this.iduser = iduser;
        this.idfournisseur = idfournisseur;
        this.idapprov = idapprov;
    }

    public Integer getIdpaiement() {
        return idpaiement;
    }

    public void setIdpaiement(Integer idpaiement) {
        this.idpaiement = idpaiement;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdfournisseur() {
        return idfournisseur;
    }

    public void setIdfournisseur(int idfournisseur) {
        this.idfournisseur = idfournisseur;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getModepaiement() {
        return modepaiement;
    }

    public void setModepaiement(String modepaiement) {
        this.modepaiement = modepaiement;
    }

    public Date getDatepaiement() {
        return datepaiement;
    }

    public void setDatepaiement(Date datepaiement) {
        this.datepaiement = datepaiement;
    }

    public Short getEtat() {
        return etat;
    }

    public void setEtat(Short etat) {
        this.etat = etat;
    }

    public int getIdapprov() {
        return idapprov;
    }

    public void setIdapprov(int idapprov) {
        this.idapprov = idapprov;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpaiement != null ? idpaiement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paiementfournisseur)) {
            return false;
        }
        Paiementfournisseur other = (Paiementfournisseur) object;
        if ((this.idpaiement == null && other.idpaiement != null) || (this.idpaiement != null && !this.idpaiement.equals(other.idpaiement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Paiementfournisseur[ idpaiement=" + idpaiement + " ]";
    }
    
}
