package bf.solinno.nanagestion.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "produit", schema = "nanangestion")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproduit", nullable = false)
    private Long id;

    @Column(name = "produit", nullable = false)
    private String produit;

    @Column(name = "prix", nullable = false)
    private Double prix;

    @Column(name = "stokactuel")
    private Double stokactuel;

    @Column(name = "stockalert")
    private Double stockalert;

    @Column(name = "idproduitfils")
    private Integer idproduitfils;

    @Column(name = "division", nullable = false)
    private Integer division;

    @Column(name = "idtype")
    private Integer idtype;

    @Column(name = "unite", length = 50)
    private String unite;

    @Column(name = "prixachat", nullable = false)
    private Double prixachat;


}