package bf.solinno.nanagestion.controllers;

import bf.solinno.nanagestion.entities.Produit;
import bf.solinno.nanagestion.services.ProduitService;
import bf.solinno.nanagestion.utils.PaginationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping(path = "/api/")
public class ProduitController {
private final Logger log= LoggerFactory.getLogger(ProduitController.class);
private final ProduitService produitService;

public ProduitController(ProduitService produitService){
    this.produitService=produitService;
}
@GetMapping
public ResponseEntity<List<Produit>>findAllProduit(Pageable pageable){
    Page<Produit> pageProduits=produitService.findAll(pageable);
    HttpHeaders headers= PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequestUri(),pageProduits);
    return ResponseEntity.ok().headers(headers).body(pageProduits.getContent());
}

}
