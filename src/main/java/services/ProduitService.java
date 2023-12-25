package services;

import models.Produit;
;

import java.util.List;


public interface ProduitService {
    List<Produit> getAllProduits();

    Produit getProduitById(long produitId);

    Produit createProduit(Produit produit);

    Produit updateProduit(long produitId, Produit updatedProduit);

    void deleteProduit(long produitId);
    // Other method signatures as needed
}


