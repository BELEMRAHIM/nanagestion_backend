package bf.solinno.nanagestion.services;

import bf.solinno.nanagestion.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProduitService {

    Produit create (Produit produit);
    Produit update(Produit produit);

    Page<Produit> findAll(Pageable pageable);
    Optional<Produit> get(Long id);
    void delete(Long id);


}
