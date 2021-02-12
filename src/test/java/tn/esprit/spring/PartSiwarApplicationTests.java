package tn.esprit.spring;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sun.el.parser.ParseException;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Reclamation;
import tn.esprit.spring.service.ServiceClient;
import tn.esprit.spring.service.ServiceReclamation;

@RunWith(SpringRunner.class)
@SpringBootTest
class PartSiwarApplicationTests {

	
	@Autowired
	ServiceClient sc;
	/*
	@Test
	public void testAjouterClient() {
		Client c = new Client("gritli","yousra","ygritli@hot.com","pwd55",1242512,"15632525");
		sc.ajouterClient(c);
		
	}
	
	
	@Test
	public void testAfficherClients() {
		List<Client> l = sc.afficherClients();
		l.forEach(c -> System.out.println(c.toString()));
	}
	
	@Test
	public void testRechercherClient() throws ParseException {
		Client c = sc.rechercherClient(7);
		System.out.println(c.toString());
		
	}
	
	
	
	@Test
	public void testSupprimerClient() {
		sc.supprimerClient(6);
	}
	
	@Test
	public void testModifierClient() {
		Client c = new Client("gheriani","ezer","ezergh@esp.tn","pwd753",13569212,"22569125");
		c.setCin(555);
		sc.modifierClient(c);
		
	}*/
	
	///////////////////////////////////////////////

	@Autowired
	ServiceReclamation sr;
	
	@Test
	public void testAjouterReclamation() {
		Client c = sc.rechercherClient(5);
		//Client c = new Client();
		Reclamation r = new Reclamation("prix","nnnnnnnn",c);
		sr.ajouterReclamation(r);
		
	}
	
	/*
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
	public void testSupprimerReclamation() {
		sr.supprimerReclamation(2);
	}*/
	
	/*
	@Test
	public void testModifierReclamation() {
		Reclamation r = sr.rechercherReclamation(2);
		r.setDescription("xx");
		sr.modifierReclamation(r);
		
	}
	*/
	
	
}
