/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "details_approv")
@NamedQueries({
    @NamedQuery(name = "DetailsApprov.findAll", query = "SELECT d FROM DetailsApprov d"),
    @NamedQuery(name = "DetailsApprov.findByIdapprov", query = "SELECT d FROM DetailsApprov d WHERE d.detailsApprovPK.idapprov = :idapprov"),
    @NamedQuery(name = "DetailsApprov.findByIdproduit", query = "SELECT d FROM DetailsApprov d WHERE d.detailsApprovPK.idproduit = :idproduit"),
    @NamedQuery(name = "DetailsApprov.findByQuantite", query = "SELECT d FROM DetailsApprov d WHERE d.quantite = :quantite"),
    @NamedQuery(name = "DetailsApprov.findByEtat", query = "SELECT d FROM DetailsApprov d WHERE d.etat = :etat"),
    @NamedQuery(name = "DetailsApprov.findByPrixunitaire", query = "SELECT d FROM DetailsApprov d WHERE d.prixunitaire = :prixunitaire"),
    @NamedQuery(name = "DetailsApprov.findByPrixvente", query = "SELECT d FROM DetailsApprov d WHERE d.prixvente = :prixvente"),
    @NamedQuery(name = "DetailsApprov.findByUnite", query = "SELECT d FROM DetailsApprov d WHERE d.unite = :unite")})
public class DetailsApprov implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetailsApprovPK detailsApprovPK;
    @Basic(optional = false)
    @Column(name = "quantite")
    private double quantite;
    @Basic(optional = false)
    @Column(name = "etat")
    private int etat;
    @Column(name = "prixunitaire")
    private Integer prixunitaire;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "prixvente")
    private Double prixvente;
    @Column(name = "unite")
    private String unite;

    public DetailsApprov() {
    }

    public DetailsApprov(DetailsApprovPK detailsApprovPK) {
        this.detailsApprovPK = detailsApprovPK;
    }

    public DetailsApprov(DetailsApprovPK detailsApprovPK, double quantite, int etat) {
        this.detailsApprovPK = detailsApprovPK;
        this.quantite = quantite;
        this.etat = etat;
    }

    public DetailsApprov(int idapprov, int idproduit) {
        this.detailsApprovPK = new DetailsApprovPK(idapprov, idproduit);
    }

    public DetailsApprovPK getDetailsApprovPK() {
        return detailsApprovPK;
    }

    public void setDetailsApprovPK(DetailsApprovPK detailsApprovPK) {
        this.detailsApprovPK = detailsApprovPK;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public Integer getPrixunitaire() {
        return prixunitaire;
    }

    public void setPrixunitaire(Integer prixunitaire) {
        this.prixunitaire = prixunitaire;
    }

    public Double getPrixvente() {
        return prixvente;
    }

    public void setPrixvente(Double prixvente) {
        this.prixvente = prixvente;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detailsApprovPK != null ? detailsApprovPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailsApprov)) {
            return false;
        }
        DetailsApprov other = (DetailsApprov) object;
        if ((this.detailsApprovPK == null && other.detailsApprovPK != null) || (this.detailsApprovPK != null && !this.detailsApprovPK.equals(other.detailsApprovPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.DetailsApprov[ detailsApprovPK=" + detailsApprovPK + " ]";
    }
    
}
