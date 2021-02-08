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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.AudioBook;
import tn.esprit.spring.entity.Ouvrage;
import tn.esprit.spring.entity.OuvrageEmpruntable;
import tn.esprit.spring.entity.OuvrageNeuf;
import tn.esprit.spring.entity.OuvrageOccasion;
import tn.esprit.spring.service.OuvrageService;
import tn.esprit.spring.service.OuvrageServiceImpl;

@RestController
public class OuvrageRestControllerImpl {

	@Autowired
	OuvrageServiceImpl ouvservice;
	
	//http://localhost:3000/springmvc/servlet/retrieveallouvrages

	@GetMapping("/retrieveallouvrages")
	@ResponseBody
	 public List<Ouvrage> getOuvrage() {
	 List<Ouvrage> list = ouvservice.retrieveAllOuvrage();
	 return list;
	 }
	
	
	// http://localhost:3000/springmvc/servlet/retrieveouvrage/8
	@GetMapping("/retrieveouvrage/{ouvrage-id}")
	 @ResponseBody
	 public Optional<Ouvrage> retrieveOuvrage(@PathVariable("ouvrage-id") int id) {
	 return ouvservice.retrieveOuvrage(id);
	 }
	
	// http://localhost:3000/springmvc/servlet/add-Ouvrage
	 @PostMapping("/add-Ouvrage")
	 @ResponseBody
	 public Ouvrage addOuvrage(@RequestBody OuvrageNeuf u) {
		 OuvrageNeuf ouv  =  ouvservice.addOuvrage(u);
	 return ouv;
	 }

	
	
	// http://localhost:3000/springmvc/servlet/remove-ouv/4
		  @DeleteMapping("/remove-ouv/{ouv-id}")
		  @ResponseBody
		 public void removeOuv(@PathVariable("ouv-id") int ouvId) {
			  ouvservice.deleteOuvrage(ouvId);
		  }
	
		// http://localhost:3000/springmvc/servlet/modify-audio
		   @PutMapping("/modify-ouv")
		   @ResponseBody
		   public Ouvrage modifyAudio(@RequestBody AudioBook ou) {
		   return ouvservice.updateOuvrageA(ou);
		   }	  
	
	
		// http://localhost:3000/springmvc/servlet/modify-neuf
		   @PutMapping("/modify-neuf")
		   @ResponseBody
		   public Ouvrage modifyNeuf(@RequestBody OuvrageNeuf ou) {
		   return ouvservice.updateOuvrageN(ou);
		   }
	
		// http://localhost:3000/springmvc/servlet/modify-emp
		   @PutMapping("/modify-emp")
		   @ResponseBody
		   public Ouvrage modifyEmp(@RequestBody OuvrageEmpruntable ou) {
		   return ouvservice.updateOuvrageE(ou);
		   }
	
			// http://localhost:3000/springmvc/servlet/modify-occ
		   @PutMapping("/modify-occ")
		   @ResponseBody
		   public Ouvrage modifyOcc(@RequestBody OuvrageOccasion ou) {
		   return ouvservice.updateOuvrageO(ou);
		   }
	
	
	
	
}
