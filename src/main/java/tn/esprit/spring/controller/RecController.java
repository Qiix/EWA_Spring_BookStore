package tn.esprit.spring.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Reclamation;
import tn.esprit.spring.service.RecService;

@RestController
public class RecController {


	@Autowired
	RecService sr;
	
	
	@GetMapping("/reclamations")
	public List<Reclamation> getAllReclamations() {
		
		return sr.afficherReclamations();
	}
	
	
	@GetMapping("/reclamations/{id}")
	public Reclamation getReclamation (@PathVariable("id") int id ) {	
		
		return sr.rechercherReclamation(id);
	}
		
		
	@PostMapping("/reclamations")
	public void addReclamation (@RequestBody Reclamation r) {
		
		sr.ajouterReclamation(r) ;	
	}
	
	
    @DeleteMapping("/reclamations/{id}")
	public void deletereclamation (@PathVariable("id") int id ) {
    	sr.supprimerReclamation(id);
	}
    
    
 	@PutMapping("/reclamations")
 	public Reclamation updateReclamation (@RequestBody Reclamation r) {
 		return sr.modifierReclamation(r);	
 	}
	
	
	
}
