/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author HP
 */
@Embeddable
public class UnitePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idUnite")
    private int idUnite;
    @Basic(optional = false)
    @Column(name = "idproduit")
    private int idproduit;

    public UnitePK() {
    }

    public UnitePK(int idUnite, int idproduit) {
        this.idUnite = idUnite;
        this.idproduit = idproduit;
    }

    public int getIdUnite() {
        return idUnite;
    }

    public void setIdUnite(int idUnite) {
        this.idUnite = idUnite;
    }

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUnite;
        hash += (int) idproduit;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitePK)) {
            return false;
        }
        UnitePK other = (UnitePK) object;
        if (this.idUnite != other.idUnite) {
            return false;
        }
        if (this.idproduit != other.idproduit) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UnitePK[ idUnite=" + idUnite + ", idproduit=" + idproduit + " ]";
    }
    
}
