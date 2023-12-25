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
@Table(name = "paiement")
@NamedQueries({
    @NamedQuery(name = "Paiement.findAll", query = "SELECT p FROM Paiement p"),
    @NamedQuery(name = "Paiement.findByIdfacture", query = "SELECT p FROM Paiement p WHERE p.idfacture = :idfacture"),
    @NamedQuery(name = "Paiement.findByIdclient", query = "SELECT p FROM Paiement p WHERE p.idclient = :idclient"),
    @NamedQuery(name = "Paiement.findByIduser", query = "SELECT p FROM Paiement p WHERE p.iduser = :iduser"),
    @NamedQuery(name = "Paiement.findByMontant", query = "SELECT p FROM Paiement p WHERE p.montant = :montant"),
    @NamedQuery(name = "Paiement.findByModepaiement", query = "SELECT p FROM Paiement p WHERE p.modepaiement = :modepaiement"),
    @NamedQuery(name = "Paiement.findByMontantTotal", query = "SELECT p FROM Paiement p WHERE p.montantTotal = :montantTotal"),
    @NamedQuery(name = "Paiement.findByIdpaiement", query = "SELECT p FROM Paiement p WHERE p.idpaiement = :idpaiement"),
    @NamedQuery(name = "Paiement.findByMontantrestant", query = "SELECT p FROM Paiement p WHERE p.montantrestant = :montantrestant"),
    @NamedQuery(name = "Paiement.findByDatepaiement", query = "SELECT p FROM Paiement p WHERE p.datepaiement = :datepaiement"),
    @NamedQuery(name = "Paiement.findByEtat", query = "SELECT p FROM Paiement p WHERE p.etat = :etat"),
    @NamedQuery(name = "Paiement.findByVerse", query = "SELECT p FROM Paiement p WHERE p.verse = :verse")})
public class Paiement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idfacture")
    private int idfacture;
    @Basic(optional = false)
    @Column(name = "idclient")
    private int idclient;
    @Column(name = "iduser")
    private Integer iduser;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montant")
    private Double montant;
    @Column(name = "modepaiement")
    private String modepaiement;
    @Column(name = "montantTotal")
    private Integer montantTotal;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpaiement")
    private Integer idpaiement;
    @Column(name = "montantrestant")
    private Integer montantrestant;
    @Column(name = "datepaiement")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datepaiement;
    @Column(name = "etat")
    private Boolean etat;
    @Column(name = "verse")
    private Integer verse;

    public Paiement() {
    }

    public Paiement(Integer idpaiement) {
        this.idpaiement = idpaiement;
    }

    public Paiement(Integer idpaiement, int idfacture, int idclient) {
        this.idpaiement = idpaiement;
        this.idfacture = idfacture;
        this.idclient = idclient;
    }

    public int getIdfacture() {
        return idfacture;
    }

    public void setIdfacture(int idfacture) {
        this.idfacture = idfacture;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
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

    public Integer getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(Integer montantTotal) {
        this.montantTotal = montantTotal;
    }

    public Integer getIdpaiement() {
        return idpaiement;
    }

    public void setIdpaiement(Integer idpaiement) {
        this.idpaiement = idpaiement;
    }

    public Integer getMontantrestant() {
        return montantrestant;
    }

    public void setMontantrestant(Integer montantrestant) {
        this.montantrestant = montantrestant;
    }

    public Date getDatepaiement() {
        return datepaiement;
    }

    public void setDatepaiement(Date datepaiement) {
        this.datepaiement = datepaiement;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public Integer getVerse() {
        return verse;
    }

    public void setVerse(Integer verse) {
        this.verse = verse;
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
        if (!(object instanceof Paiement)) {
            return false;
        }
        Paiement other = (Paiement) object;
        if ((this.idpaiement == null && other.idpaiement != null) || (this.idpaiement != null && !this.idpaiement.equals(other.idpaiement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Paiement[ idpaiement=" + idpaiement + " ]";
    }
    
}
