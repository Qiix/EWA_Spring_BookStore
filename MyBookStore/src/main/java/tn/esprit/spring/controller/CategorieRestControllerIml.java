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
import tn.esprit.spring.entity.Categorie;

import tn.esprit.spring.service.CategorieServiceImpl;

@RestController
public class CategorieRestControllerIml {

	
	@Autowired
	CategorieServiceImpl cat;
	
	//http://localhost:3000/springmvc/servlet/retrieveallCategorie
	@GetMapping("/retrieveallCategorie")
	@ResponseBody
	 public List<Categorie> getOuvrage() {
	 List<Categorie> list = cat.retrieveAllCat();
	 return list;
	 }
	
	
	// http://localhost:3000/springmvc/servlet/retrieve-categ/1
	@GetMapping("/retrieve-categ/{cat-id}")
	 @ResponseBody
	 public Optional<Categorie> retrieveCategorie(@PathVariable("cat-id") int id) {
	 return cat.retrieveCat(id);
	 }
	
	// http://localhost:3000/springmvc/servlet/add-Categorie
	 @PostMapping("/add-Categorie")
	 @ResponseBody
	 public Categorie addOuvrage(@RequestBody Categorie u) {
		 Categorie c  = cat.addCategorie(u);
	 return c;
	 }
	
	
	
	// http://localhost:3000/springmvc/servlet/remove-cat/2
		  @DeleteMapping("/remove-cat/{cat-id}")
		  @ResponseBody
		 public void removeOuv(@PathVariable("cat-id") int id) {
			  cat.deleteCat(id);
		  }
	
		// http://localhost:3000/springmvc/servlet/modify-cat
		   @PutMapping("/modify-cat")
		   @ResponseBody
		   public Categorie modifyAudio(@RequestBody Categorie ou) {
		   return cat.updateCat(ou);
		   }	  
	
		   public void addCatOuv (int catId, int ouvrageId)
		   {
		cat.affecterCategorieAOuvrage(catId, ouvrageId);
		   }
	
}
