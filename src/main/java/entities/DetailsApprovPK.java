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
public class DetailsApprovPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idapprov")
    private int idapprov;
    @Basic(optional = false)
    @Column(name = "idproduit")
    private int idproduit;

    public DetailsApprovPK() {
    }

    public DetailsApprovPK(int idapprov, int idproduit) {
        this.idapprov = idapprov;
        this.idproduit = idproduit;
    }

    public int getIdapprov() {
        return idapprov;
    }

    public void setIdapprov(int idapprov) {
        this.idapprov = idapprov;
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
        hash += (int) idapprov;
        hash += (int) idproduit;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailsApprovPK)) {
            return false;
        }
        DetailsApprovPK other = (DetailsApprovPK) object;
        if (this.idapprov != other.idapprov) {
            return false;
        }
        if (this.idproduit != other.idproduit) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.DetailsApprovPK[ idapprov=" + idapprov + ", idproduit=" + idproduit + " ]";
    }
    
}
