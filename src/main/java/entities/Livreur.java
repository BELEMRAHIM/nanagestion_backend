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
@Table(name = "livreur")
@NamedQueries({
    @NamedQuery(name = "Livreur.findAll", query = "SELECT l FROM Livreur l"),
    @NamedQuery(name = "Livreur.findByIdLiveur", query = "SELECT l FROM Livreur l WHERE l.idLiveur = :idLiveur"),
    @NamedQuery(name = "Livreur.findByNomPremon", query = "SELECT l FROM Livreur l WHERE l.nomPremon = :nomPremon"),
    @NamedQuery(name = "Livreur.findByTelephone", query = "SELECT l FROM Livreur l WHERE l.telephone = :telephone")})
public class Livreur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLiveur")
    private Integer idLiveur;
    @Basic(optional = false)
    @Column(name = "NomPremon")
    private String nomPremon;
    @Column(name = "telephone")
    private String telephone;

    public Livreur() {
    }

    public Livreur(Integer idLiveur) {
        this.idLiveur = idLiveur;
    }

    public Livreur(Integer idLiveur, String nomPremon) {
        this.idLiveur = idLiveur;
        this.nomPremon = nomPremon;
    }

    public Integer getIdLiveur() {
        return idLiveur;
    }

    public void setIdLiveur(Integer idLiveur) {
        this.idLiveur = idLiveur;
    }

    public String getNomPremon() {
        return nomPremon;
    }

    public void setNomPremon(String nomPremon) {
        this.nomPremon = nomPremon;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLiveur != null ? idLiveur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livreur)) {
            return false;
        }
        Livreur other = (Livreur) object;
        if ((this.idLiveur == null && other.idLiveur != null) || (this.idLiveur != null && !this.idLiveur.equals(other.idLiveur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Livreur[ idLiveur=" + idLiveur + " ]";
    }
    
}
