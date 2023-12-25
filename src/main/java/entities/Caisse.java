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
@Table(name = "caisse")
@NamedQueries({
    @NamedQuery(name = "Caisse.findAll", query = "SELECT c FROM Caisse c"),
    @NamedQuery(name = "Caisse.findByIdcaisse", query = "SELECT c FROM Caisse c WHERE c.idcaisse = :idcaisse"),
    @NamedQuery(name = "Caisse.findByMontant", query = "SELECT c FROM Caisse c WHERE c.montant = :montant"),
    @NamedQuery(name = "Caisse.findByDatecaisse", query = "SELECT c FROM Caisse c WHERE c.datecaisse = :datecaisse"),
    @NamedQuery(name = "Caisse.findByIduser", query = "SELECT c FROM Caisse c WHERE c.iduser = :iduser"),
    @NamedQuery(name = "Caisse.findByDescription", query = "SELECT c FROM Caisse c WHERE c.description = :description")})
public class Caisse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcaisse")
    private Integer idcaisse;
    @Column(name = "montant")
    private Integer montant;
    @Column(name = "datecaisse")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecaisse;
    @Column(name = "iduser")
    private Integer iduser;
    @Column(name = "description")
    private String description;

    public Caisse() {
    }

    public Caisse(Integer idcaisse) {
        this.idcaisse = idcaisse;
    }

    public Integer getIdcaisse() {
        return idcaisse;
    }

    public void setIdcaisse(Integer idcaisse) {
        this.idcaisse = idcaisse;
    }

    public Integer getMontant() {
        return montant;
    }

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public Date getDatecaisse() {
        return datecaisse;
    }

    public void setDatecaisse(Date datecaisse) {
        this.datecaisse = datecaisse;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcaisse != null ? idcaisse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caisse)) {
            return false;
        }
        Caisse other = (Caisse) object;
        if ((this.idcaisse == null && other.idcaisse != null) || (this.idcaisse != null && !this.idcaisse.equals(other.idcaisse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Caisse[ idcaisse=" + idcaisse + " ]";
    }
    
}
