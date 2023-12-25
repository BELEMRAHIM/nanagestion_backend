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
@Table(name = "approv")
@NamedQueries({
    @NamedQuery(name = "Approv.findAll", query = "SELECT a FROM Approv a"),
    @NamedQuery(name = "Approv.findByIdapprov", query = "SELECT a FROM Approv a WHERE a.idapprov = :idapprov"),
    @NamedQuery(name = "Approv.findByDateapprov", query = "SELECT a FROM Approv a WHERE a.dateapprov = :dateapprov"),
    @NamedQuery(name = "Approv.findByCommentaire", query = "SELECT a FROM Approv a WHERE a.commentaire = :commentaire"),
    @NamedQuery(name = "Approv.findByIdFournisseur", query = "SELECT a FROM Approv a WHERE a.idFournisseur = :idFournisseur"),
    @NamedQuery(name = "Approv.findByStatus", query = "SELECT a FROM Approv a WHERE a.status = :status"),
    @NamedQuery(name = "Approv.findByEtat", query = "SELECT a FROM Approv a WHERE a.etat = :etat"),
    @NamedQuery(name = "Approv.findByModepaiement", query = "SELECT a FROM Approv a WHERE a.modepaiement = :modepaiement"),
    @NamedQuery(name = "Approv.findByIduser", query = "SELECT a FROM Approv a WHERE a.iduser = :iduser")})
public class Approv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idapprov")
    private Integer idapprov;
    @Basic(optional = false)
    @Column(name = "dateapprov")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateapprov;
    @Column(name = "commentaire")
    private String commentaire;
    @Basic(optional = false)
    @Column(name = "idFournisseur")
    private int idFournisseur;
    @Basic(optional = false)
    @Column(name = "status")
    private short status;
    @Column(name = "etat")
    private String etat;
    @Column(name = "modepaiement")
    private String modepaiement;
    @Basic(optional = false)
    @Column(name = "iduser")
    private int iduser;

    public Approv() {
    }

    public Approv(Integer idapprov) {
        this.idapprov = idapprov;
    }

    public Approv(Integer idapprov, Date dateapprov, int idFournisseur, short status, int iduser) {
        this.idapprov = idapprov;
        this.dateapprov = dateapprov;
        this.idFournisseur = idFournisseur;
        this.status = status;
        this.iduser = iduser;
    }

    public Integer getIdapprov() {
        return idapprov;
    }

    public void setIdapprov(Integer idapprov) {
        this.idapprov = idapprov;
    }

    public Date getDateapprov() {
        return dateapprov;
    }

    public void setDateapprov(Date dateapprov) {
        this.dateapprov = dateapprov;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getModepaiement() {
        return modepaiement;
    }

    public void setModepaiement(String modepaiement) {
        this.modepaiement = modepaiement;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idapprov != null ? idapprov.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Approv)) {
            return false;
        }
        Approv other = (Approv) object;
        if ((this.idapprov == null && other.idapprov != null) || (this.idapprov != null && !this.idapprov.equals(other.idapprov))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Approv[ idapprov=" + idapprov + " ]";
    }
    
}
