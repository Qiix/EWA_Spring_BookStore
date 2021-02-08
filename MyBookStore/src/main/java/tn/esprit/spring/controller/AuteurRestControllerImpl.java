
package tn.esprit.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Auteur;
import tn.esprit.spring.service.AuteurServiceImpl;

@RestController
public class AuteurRestControllerImpl {

	
	@Autowired
	AuteurServiceImpl aut;
	
	
	//http://localhost:3000/springmvc/servlet/retrieveallAut
		@GetMapping("/retrieveallAut")
		@ResponseBody
		 public List<Auteur> getAuteur() {
		 List<Auteur> list = aut.retrieveAllCAut();
		 return list;
		 }
		
		
		// http://localhost:3000/springmvc/servlet/retrieveauteur/8
		@GetMapping("/retrieveauteur/{id}")
		 @ResponseBody
		 public Optional<Auteur> retrieveAuteur(@PathVariable("id") int id) {
		 return aut.retrieveAut(id);
		 }
		
		// http://localhost:3000/springmvc/servlet/add-auteur
		 @PostMapping("/add-auteur")
		 @ResponseBody
		 public Auteur addOuvrage(@RequestBody Auteur u) {
			 Auteur c  = aut.addAuteur(u);
		 return c;
		 }
		
		
		
		// http://localhost:3000/springmvc/servlet/remove-aut/{id}
			  @DeleteMapping("/remove-aut/{id}")
			  @ResponseBody
			 public void removeAut(@PathVariable("id") int id) {
				  aut.deleteAut(id);
			  }
		
			// http://localhost:3000/springmvc/servlet/modify-aut
			   @PutMapping("/modify-aut")
			   @ResponseBody
			   public Auteur modifyAut(@RequestBody Auteur ou) {
			   return aut.updateAut(ou);
			   }	  
		
		
	
	
	
	
}
