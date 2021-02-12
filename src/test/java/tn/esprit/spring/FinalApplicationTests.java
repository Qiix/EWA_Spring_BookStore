package tn.esprit.spring;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sun.el.parser.ParseException;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Reclamation;
import tn.esprit.spring.service.ClientService;
import tn.esprit.spring.service.RecService;


@SpringBootTest
class FinalApplicationTests {

	// Test Client 
	
	/*@Autowired
	ClientService sc;
	
	@Test
	public void testAjouterClient() {
		Client c = new Client("gritli","yousra","ygritli@hot.com","pwd55",1242512,"15632525");
		//Client c = new Client("jlassi","shayma","shsh@esprit.tn","pwdshayma",5252512,"2654525");
		sc.ajouterClient(c);
		
	}
	
	
	@Test
	public void testAfficherClients() {
		List<Client> l = sc.afficherClients();
		l.forEach(c -> System.out.println(c.toString()));
	}
	
	@Test
	public void testRechercherClient() throws ParseException {
		Client c = sc.rechercherClient(1);
		System.out.println(c.toString());
		
	}
	
	
	
	@Test
	public void testSupprimerClient() {
		sc.supprimerClient(1);
	}
	
	@Test
	public void testModifierClient() {
		Client c = sc.rechercherClient(2);
		c.setCin(123456);
		sc.modifierClient(c);
		
	}*/
	
	// Tests Reclamation
	
	@Autowired
	RecService sr;
	
	@Test
	public void testAjouterReclamation() {
		//Client c = new Client("jlassi","shayma","shsh@esprit.tn","pwdshayma",5252512,"2654525");
		Reclamation r = new Reclamation("retard","deçu ....");
		sr.ajouterReclamation(r);
		
	}
	
	
	@Test
	public void testAfficherReclamations() {
		List<Reclamation> l = sr.afficherReclamations();
		l.forEach(r -> System.out.println(r.toString()));
	}
	
	@Test
	public void testRechercherReclamation() throws ParseException {
		Reclamation r = sr.rechercherReclamation(2);
		System.out.println(r.toString());
		
	}
	

	
	@Test
	public void testSupprimerReclamation() throws ParseException {
		sr.supprimerReclamation(2);
	}
	
	
	@Test
	public void testModifierReclamation() {
		Reclamation r = sr.rechercherReclamation(2);
		r.setDescription("xx");
		sr.modifierReclamation(r);
		
	}
	
}
