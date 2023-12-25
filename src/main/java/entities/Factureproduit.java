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
@Table(name = "factureproduit")
@NamedQueries({
    @NamedQuery(name = "Factureproduit.findAll", query = "SELECT f FROM Factureproduit f"),
    @NamedQuery(name = "Factureproduit.findByIdfacture", query = "SELECT f FROM Factureproduit f WHERE f.idfacture = :idfacture"),
    @NamedQuery(name = "Factureproduit.findByIdproduit", query = "SELECT f FROM Factureproduit f WHERE f.idproduit = :idproduit"),
    @NamedQuery(name = "Factureproduit.findByPrix", query = "SELECT f FROM Factureproduit f WHERE f.prix = :prix"),
    @NamedQuery(name = "Factureproduit.findByQuantite", query = "SELECT f FROM Factureproduit f WHERE f.quantite = :quantite"),
    @NamedQuery(name = "Factureproduit.findByEtat", query = "SELECT f FROM Factureproduit f WHERE f.etat = :etat"),
    @NamedQuery(name = "Factureproduit.findByIdfactureproduit", query = "SELECT f FROM Factureproduit f WHERE f.idfactureproduit = :idfactureproduit"),
    @NamedQuery(name = "Factureproduit.findByLigne", query = "SELECT f FROM Factureproduit f WHERE f.ligne = :ligne"),
    @NamedQuery(name = "Factureproduit.findByUnite", query = "SELECT f FROM Factureproduit f WHERE f.unite = :unite"),
    @NamedQuery(name = "Factureproduit.findByMultiplication", query = "SELECT f FROM Factureproduit f WHERE f.multiplication = :multiplication")})
public class Factureproduit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idfacture")
    private int idfacture;
    @Basic(optional = false)
    @Column(name = "idproduit")
    private int idproduit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "prix")
    private Double prix;
    @Column(name = "quantite")
    private Integer quantite;
    @Column(name = "etat")
    private Integer etat;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfactureproduit")
    private Integer idfactureproduit;
    @Basic(optional = false)
    @Column(name = "ligne")
    private int ligne;
    @Basic(optional = false)
    @Column(name = "unite")
    private String unite;
    @Basic(optional = false)
    @Column(name = "multiplication")
    private int multiplication;

    public Factureproduit() {
    }

    public Factureproduit(Integer idfactureproduit) {
        this.idfactureproduit = idfactureproduit;
    }

    public Factureproduit(Integer idfactureproduit, int idfacture, int idproduit, int ligne, String unite, int multiplication) {
        this.idfactureproduit = idfactureproduit;
        this.idfacture = idfacture;
        this.idproduit = idproduit;
        this.ligne = ligne;
        this.unite = unite;
        this.multiplication = multiplication;
    }

    public int getIdfacture() {
        return idfacture;
    }

    public void setIdfacture(int idfacture) {
        this.idfacture = idfacture;
    }

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    public Integer getIdfactureproduit() {
        return idfactureproduit;
    }

    public void setIdfactureproduit(Integer idfactureproduit) {
        this.idfactureproduit = idfactureproduit;
    }

    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public int getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(int multiplication) {
        this.multiplication = multiplication;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfactureproduit != null ? idfactureproduit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factureproduit)) {
            return false;
        }
        Factureproduit other = (Factureproduit) object;
        if ((this.idfactureproduit == null && other.idfactureproduit != null) || (this.idfactureproduit != null && !this.idfactureproduit.equals(other.idfactureproduit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Factureproduit[ idfactureproduit=" + idfactureproduit + " ]";
    }
    
}
