package bf.solinno.nanagestion.services_impl;

import bf.solinno.nanagestion.entities.Produit;
import bf.solinno.nanagestion.repositories.ProduitRepository;
import bf.solinno.nanagestion.services.ProduitService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProduitServiceImpl implements ProduitService {

    private final ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit create(Produit produit) {
        return this.produitRepository.save(produit);
    }

    @Override
    public Produit update(Produit produit) {
        return this.produitRepository.save(produit);
    }

    @Override
    public Page<Produit> findAll(Pageable pageable) {
        return produitRepository.findAll(pageable);
    }

    @Override
    public Optional<Produit> get(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }
}
