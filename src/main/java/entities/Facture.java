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
@Table(name = "facture")
@NamedQueries({
    @NamedQuery(name = "Facture.findAll", query = "SELECT f FROM Facture f"),
    @NamedQuery(name = "Facture.findByIdfacture", query = "SELECT f FROM Facture f WHERE f.idfacture = :idfacture"),
    @NamedQuery(name = "Facture.findByDatefacture", query = "SELECT f FROM Facture f WHERE f.datefacture = :datefacture"),
    @NamedQuery(name = "Facture.findByEtape", query = "SELECT f FROM Facture f WHERE f.etape = :etape"),
    @NamedQuery(name = "Facture.findByEtat", query = "SELECT f FROM Facture f WHERE f.etat = :etat"),
    @NamedQuery(name = "Facture.findByDateproforma", query = "SELECT f FROM Facture f WHERE f.dateproforma = :dateproforma"),
    @NamedQuery(name = "Facture.findByModepayement", query = "SELECT f FROM Facture f WHERE f.modepayement = :modepayement"),
    @NamedQuery(name = "Facture.findByIdclient", query = "SELECT f FROM Facture f WHERE f.idclient = :idclient"),
    @NamedQuery(name = "Facture.findByTva", query = "SELECT f FROM Facture f WHERE f.tva = :tva"),
    @NamedQuery(name = "Facture.findByReference", query = "SELECT f FROM Facture f WHERE f.reference = :reference"),
    @NamedQuery(name = "Facture.findByMontanttotal", query = "SELECT f FROM Facture f WHERE f.montanttotal = :montanttotal"),
    @NamedQuery(name = "Facture.findByMontantverse", query = "SELECT f FROM Facture f WHERE f.montantverse = :montantverse"),
    @NamedQuery(name = "Facture.findByNb", query = "SELECT f FROM Facture f WHERE f.nb = :nb"),
    @NamedQuery(name = "Facture.findByIduser", query = "SELECT f FROM Facture f WHERE f.iduser = :iduser"),
    @NamedQuery(name = "Facture.findByStatus", query = "SELECT f FROM Facture f WHERE f.status = :status"),
    @NamedQuery(name = "Facture.findByImpr", query = "SELECT f FROM Facture f WHERE f.impr = :impr"),
    @NamedQuery(name = "Facture.findByIdLiveur", query = "SELECT f FROM Facture f WHERE f.idLiveur = :idLiveur")})
public class Facture implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfacture")
    private Integer idfacture;
    @Column(name = "datefacture")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datefacture;
    @Column(name = "etape")
    private String etape;
    @Column(name = "etat")
    private String etat;
    @Column(name = "dateproforma")
    @Temporal(TemporalType.DATE)
    private Date dateproforma;
    @Column(name = "modepayement")
    private String modepayement;
    @Column(name = "idclient")
    private Integer idclient;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tva")
    private Double tva;
    @Column(name = "reference")
    private String reference;
    @Column(name = "montanttotal")
    private Double montanttotal;
    @Basic(optional = false)
    @Column(name = "montantverse")
    private int montantverse;
    @Column(name = "NB")
    private String nb;
    @Basic(optional = false)
    @Column(name = "iduser")
    private int iduser;
    @Basic(optional = false)
    @Column(name = "status")
    private int status;
    @Basic(optional = false)
    @Column(name = "impr")
    private int impr;
    @Column(name = "idLiveur")
    private Integer idLiveur;

    public Facture() {
    }

    public Facture(Integer idfacture) {
        this.idfacture = idfacture;
    }

    public Facture(Integer idfacture, int montantverse, int iduser, int status, int impr) {
        this.idfacture = idfacture;
        this.montantverse = montantverse;
        this.iduser = iduser;
        this.status = status;
        this.impr = impr;
    }

    public Integer getIdfacture() {
        return idfacture;
    }

    public void setIdfacture(Integer idfacture) {
        this.idfacture = idfacture;
    }

    public Date getDatefacture() {
        return datefacture;
    }

    public void setDatefacture(Date datefacture) {
        this.datefacture = datefacture;
    }

    public String getEtape() {
        return etape;
    }

    public void setEtape(String etape) {
        this.etape = etape;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Date getDateproforma() {
        return dateproforma;
    }

    public void setDateproforma(Date dateproforma) {
        this.dateproforma = dateproforma;
    }

    public String getModepayement() {
        return modepayement;
    }

    public void setModepayement(String modepayement) {
        this.modepayement = modepayement;
    }

    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Double getMontanttotal() {
        return montanttotal;
    }

    public void setMontanttotal(Double montanttotal) {
        this.montanttotal = montanttotal;
    }

    public int getMontantverse() {
        return montantverse;
    }

    public void setMontantverse(int montantverse) {
        this.montantverse = montantverse;
    }

    public String getNb() {
        return nb;
    }

    public void setNb(String nb) {
        this.nb = nb;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getImpr() {
        return impr;
    }

    public void setImpr(int impr) {
        this.impr = impr;
    }

    public Integer getIdLiveur() {
        return idLiveur;
    }

    public void setIdLiveur(Integer idLiveur) {
        this.idLiveur = idLiveur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfacture != null ? idfacture.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facture)) {
            return false;
        }
        Facture other = (Facture) object;
        if ((this.idfacture == null && other.idfacture != null) || (this.idfacture != null && !this.idfacture.equals(other.idfacture))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Facture[ idfacture=" + idfacture + " ]";
    }
    
}
