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
@Table(name = "unite")
@NamedQueries({
    @NamedQuery(name = "Unite.findAll", query = "SELECT u FROM Unite u"),
    @NamedQuery(name = "Unite.findByIdUnite", query = "SELECT u FROM Unite u WHERE u.unitePK.idUnite = :idUnite"),
    @NamedQuery(name = "Unite.findByIdproduit", query = "SELECT u FROM Unite u WHERE u.unitePK.idproduit = :idproduit"),
    @NamedQuery(name = "Unite.findByDescription", query = "SELECT u FROM Unite u WHERE u.description = :description"),
    @NamedQuery(name = "Unite.findByPrix", query = "SELECT u FROM Unite u WHERE u.prix = :prix"),
    @NamedQuery(name = "Unite.findByMultiplication", query = "SELECT u FROM Unite u WHERE u.multiplication = :multiplication")})
public class Unite implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UnitePK unitePK;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "prix")
    private double prix;
    @Basic(optional = false)
    @Column(name = "multiplication")
    private int multiplication;

    public Unite() {
    }

    public Unite(UnitePK unitePK) {
        this.unitePK = unitePK;
    }

    public Unite(UnitePK unitePK, String description, double prix, int multiplication) {
        this.unitePK = unitePK;
        this.description = description;
        this.prix = prix;
        this.multiplication = multiplication;
    }

    public Unite(int idUnite, int idproduit) {
        this.unitePK = new UnitePK(idUnite, idproduit);
    }

    public UnitePK getUnitePK() {
        return unitePK;
    }

    public void setUnitePK(UnitePK unitePK) {
        this.unitePK = unitePK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
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
        hash += (unitePK != null ? unitePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unite)) {
            return false;
        }
        Unite other = (Unite) object;
        if ((this.unitePK == null && other.unitePK != null) || (this.unitePK != null && !this.unitePK.equals(other.unitePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Unite[ unitePK=" + unitePK + " ]";
    }
    
}
