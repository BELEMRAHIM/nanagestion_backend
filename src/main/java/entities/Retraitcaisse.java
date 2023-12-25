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
@Table(name = "retraitcaisse")
@NamedQueries({
    @NamedQuery(name = "Retraitcaisse.findAll", query = "SELECT r FROM Retraitcaisse r"),
    @NamedQuery(name = "Retraitcaisse.findByIdretrait", query = "SELECT r FROM Retraitcaisse r WHERE r.idretrait = :idretrait"),
    @NamedQuery(name = "Retraitcaisse.findByMontant", query = "SELECT r FROM Retraitcaisse r WHERE r.montant = :montant"),
    @NamedQuery(name = "Retraitcaisse.findByIduser", query = "SELECT r FROM Retraitcaisse r WHERE r.iduser = :iduser"),
    @NamedQuery(name = "Retraitcaisse.findByCommentaire", query = "SELECT r FROM Retraitcaisse r WHERE r.commentaire = :commentaire"),
    @NamedQuery(name = "Retraitcaisse.findByDateretrait", query = "SELECT r FROM Retraitcaisse r WHERE r.dateretrait = :dateretrait")})
public class Retraitcaisse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idretrait")
    private Integer idretrait;
    @Basic(optional = false)
    @Column(name = "montant")
    private int montant;
    @Basic(optional = false)
    @Column(name = "iduser")
    private int iduser;
    @Basic(optional = false)
    @Column(name = "commentaire")
    private String commentaire;
    @Basic(optional = false)
    @Column(name = "dateretrait")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateretrait;

    public Retraitcaisse() {
    }

    public Retraitcaisse(Integer idretrait) {
        this.idretrait = idretrait;
    }

    public Retraitcaisse(Integer idretrait, int montant, int iduser, String commentaire, Date dateretrait) {
        this.idretrait = idretrait;
        this.montant = montant;
        this.iduser = iduser;
        this.commentaire = commentaire;
        this.dateretrait = dateretrait;
    }

    public Integer getIdretrait() {
        return idretrait;
    }

    public void setIdretrait(Integer idretrait) {
        this.idretrait = idretrait;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDateretrait() {
        return dateretrait;
    }

    public void setDateretrait(Date dateretrait) {
        this.dateretrait = dateretrait;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idretrait != null ? idretrait.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Retraitcaisse)) {
            return false;
        }
        Retraitcaisse other = (Retraitcaisse) object;
        if ((this.idretrait == null && other.idretrait != null) || (this.idretrait != null && !this.idretrait.equals(other.idretrait))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Retraitcaisse[ idretrait=" + idretrait + " ]";
    }
    
}
