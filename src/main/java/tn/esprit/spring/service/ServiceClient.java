package tn.esprit.spring.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.repository.ClientRepository;

@Service
public class ServiceClient implements InterClient {
	
	@Autowired  
	ClientRepository cr;  
	

	@Override
	public List<Client> afficherClients() {
		
		List<Client> l = new ArrayList<Client>();
	     
		cr.findAll().forEach(c -> l.add(c)); 
		
        return l;
	}
	

	@Override
	public Client rechercherClient(int id) {
		
		return cr.findById(id).get();  
	}

	
	@Override
	public Client ajouterClient(Client c) {
		return cr.save(c);
		
	}

	@Override
	public void supprimerClient(int id) {
		cr.deleteById(id);  
		
	}

	@Override
	public void modifierClient(Client c) {
		cr.save(c); 
		
	}

}
