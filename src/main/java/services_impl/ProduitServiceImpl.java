package services_impl;

import models.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ProduitRepository;
import services.ProduitService;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit getProduitById(long produitId) {
        return produitRepository.findById(produitId)
                .orElse(null); // Handle if the produit is not found
    }

    @Override
    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit updateProduit(long produitId, Produit updatedProduit) {
        Produit existingProduit = produitRepository.findById(produitId)
                .orElse(null);

        if (existingProduit != null) {
            existingProduit.setProductName(updatedProduit.getProductName());
            existingProduit.setPrix(updatedProduit.getPrix());
            // Set other updated fields as needed
            return produitRepository.save(existingProduit);
        } else {
            return null; // Handle if the produit is not found
        }
    }

    @Override
    public void deleteProduit(long produitId) {
        produitRepository.deleteById(produitId);
    }
}
