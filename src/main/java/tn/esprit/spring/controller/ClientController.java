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

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.service.ServiceClient;

@RestController
public class ClientController {

	@Autowired  
	ServiceClient sc;  
	
	@GetMapping("/clients")  
	private List<Client> getAllClients(){  
		return sc.afficherClients();  
	} 
	
	
	@GetMapping("/clients/{id}")  
	private Client getClient(@PathVariable("id") int id){  
		return sc.rechercherClient(id);  
	}  
	
	  
	@DeleteMapping("/clients/{id}")  
	private void deleteBook(@PathVariable("id") int id){  
		sc.supprimerClient(id);  
	}  
	
	
	@PostMapping("/clients")  
	private int addClient(@RequestBody Client c){  
		sc.ajouterClient(c);  
		return c.getId();  
	}  

   
	@PutMapping("/clients")  
	private Client update(@RequestBody Client c){  
		sc.modifierClient(c);  
		return c;  
	}  
	
	
}
