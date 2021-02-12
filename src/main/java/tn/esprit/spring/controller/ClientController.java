package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.service.ClientService;

@RestController
public class ClientController {

	@Autowired  
	ClientService sc;  
	
	@GetMapping("/clients") 
	@ResponseBody
	private List<Client> getAllClients(){  
		return sc.afficherClients();  
	} 
	
	
	@GetMapping("/clients/{id}")
	@ResponseBody
	private Client getClient(@PathVariable("id") int id){  
		return sc.rechercherClient(id);  
	}  
	
	  
	@DeleteMapping("/clients/{id}") 
	@ResponseBody
	private void deleteClient(@PathVariable("id") int id){  
		sc.supprimerClient(id);  
	}  
	
	
	@PostMapping("/clients")  
	@ResponseBody
	private int addClient(@RequestBody Client c){  
		sc.ajouterClient(c);  
		return c.getId();  
	}  

   
	@PutMapping("/clients")  
	@ResponseBody
	private Client update(@RequestBody Client c){  
		sc.modifierClient(c);  
		return c;  
	}  
	

	@PostMapping("/RecAClient/{idR}/{idC}")
	public void affecterReclamationAClient(@PathVariable("idR") int x, @PathVariable("idC") int y )
	{
		sc.affecterReclamationAClient(x, y);
	}
	
	
}
