/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "numero_sequence")
@NamedQueries({
    @NamedQuery(name = "NumeroSequence.findAll", query = "SELECT n FROM NumeroSequence n"),
    @NamedQuery(name = "NumeroSequence.findBySequence", query = "SELECT n FROM NumeroSequence n WHERE n.sequence = :sequence"),
    @NamedQuery(name = "NumeroSequence.findByAnnee", query = "SELECT n FROM NumeroSequence n WHERE n.annee = :annee")})
public class NumeroSequence implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "sequence")
    private Integer sequence;
    @Id
    @Basic(optional = false)
    @Column(name = "annee")
    private String annee;

    public NumeroSequence() {
    }

    public NumeroSequence(String annee) {
        this.annee = annee;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (annee != null ? annee.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NumeroSequence)) {
            return false;
        }
        NumeroSequence other = (NumeroSequence) object;
        if ((this.annee == null && other.annee != null) || (this.annee != null && !this.annee.equals(other.annee))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.NumeroSequence[ annee=" + annee + " ]";
    }
    
}
