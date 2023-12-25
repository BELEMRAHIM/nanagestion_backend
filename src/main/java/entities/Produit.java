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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "produit")
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p"),
    @NamedQuery(name = "Produit.findByIdproduit", query = "SELECT p FROM Produit p WHERE p.idproduit = :idproduit"),
    @NamedQuery(name = "Produit.findByProduit", query = "SELECT p FROM Produit p WHERE p.produit = :produit"),
    @NamedQuery(name = "Produit.findByPrix", query = "SELECT p FROM Produit p WHERE p.prix = :prix"),
    @NamedQuery(name = "Produit.findByStokactuel", query = "SELECT p FROM Produit p WHERE p.stokactuel = :stokactuel"),
    @NamedQuery(name = "Produit.findByStockalert", query = "SELECT p FROM Produit p WHERE p.stockalert = :stockalert"),
    @NamedQuery(name = "Produit.findByUnite", query = "SELECT p FROM Produit p WHERE p.unite = :unite"),
    @NamedQuery(name = "Produit.findByPrixachat", query = "SELECT p FROM Produit p WHERE p.prixachat = :prixachat"),
    @NamedQuery(name = "Produit.findByType", query = "SELECT p FROM Produit p WHERE p.type = :type"),
    @NamedQuery(name = "Produit.findByDeclasser", query = "SELECT p FROM Produit p WHERE p.declasser = :declasser"),
    @NamedQuery(name = "Produit.findByImage", query = "SELECT p FROM Produit p WHERE p.image = :image")})
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproduit")
    private Integer idproduit;
    @Basic(optional = false)
    @Column(name = "produit")
    private String produit;
    @Basic(optional = false)
    @Column(name = "prix")
    private double prix;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "stokactuel")
    private Double stokactuel;
    @Column(name = "stockalert")
    private Double stockalert;
    @Basic(optional = false)
    @Column(name = "unite")
    private String unite;
    @Basic(optional = false)
    @Column(name = "prixachat")
    private double prixachat;
    @Basic(optional = false)
    @Column(name = "type")
    private int type;
    @Column(name = "declasser")
    private Integer declasser;
    @Column(name = "image")
    private String image;
    @JoinColumn(name = "idtype", referencedColumnName = "idtype")
    @ManyToOne
    private Type idtype;

    public Produit() {
    }

    public Produit(Integer idproduit) {
        this.idproduit = idproduit;
    }

    public Produit(Integer idproduit, String produit, double prix, String unite, double prixachat, int type) {
        this.idproduit = idproduit;
        this.produit = produit;
        this.prix = prix;
        this.unite = unite;
        this.prixachat = prixachat;
        this.type = type;
    }

    public Integer getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(Integer idproduit) {
        this.idproduit = idproduit;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Double getStokactuel() {
        return stokactuel;
    }

    public void setStokactuel(Double stokactuel) {
        this.stokactuel = stokactuel;
    }

    public Double getStockalert() {
        return stockalert;
    }

    public void setStockalert(Double stockalert) {
        this.stockalert = stockalert;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public double getPrixachat() {
        return prixachat;
    }

    public void setPrixachat(double prixachat) {
        this.prixachat = prixachat;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Integer getDeclasser() {
        return declasser;
    }

    public void setDeclasser(Integer declasser) {
        this.declasser = declasser;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Type getIdtype() {
        return idtype;
    }

    public void setIdtype(Type idtype) {
        this.idtype = idtype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproduit != null ? idproduit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.idproduit == null && other.idproduit != null) || (this.idproduit != null && !this.idproduit.equals(other.idproduit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Produit[ idproduit=" + idproduit + " ]";
    }
    
}
