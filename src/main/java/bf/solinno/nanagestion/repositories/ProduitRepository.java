package bf.solinno.nanagestion.repositories;

import bf.solinno.nanagestion.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;


//@RepositoryRestResource(path="produits")
public interface ProduitRepository extends JpaRepository<Produit, String> {
}