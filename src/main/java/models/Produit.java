package models;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproduit")
    private Long id;

    @Column(name = "produit")
    private String productName;

    @Column(name = "prix")
    private double prix;

    @Column(name = "stokactuel")
    private Double stockActuel;

    @Column(name = "stockalert")
    private Double stockAlert;

    @ManyToOne
    @JoinColumn(name = "idtype", referencedColumnName = "idtype")
    private Type type;

    @Column(name = "unite")
    private String unite;

    @Column(name = "prixachat")
    private double prixAchat;

    @Column(name = "type")
    private int typeValue;

    @Column(name = "declasser")
    private int declasser;

    @Column(name = "image")
    private String image;
}
