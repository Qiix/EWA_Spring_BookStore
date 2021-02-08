package tn.esprit.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.service.AuteurServiceImpl;
import tn.esprit.spring.service.CategorieServiceImpl;
import tn.esprit.spring.service.OuvrageServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRetrieve {
	@Autowired
	AuteurServiceImpl auteur;
	@Autowired
	OuvrageServiceImpl ouvrage;
	@Autowired
	CategorieServiceImpl categorie;
	@Test
	public void testRetrieveCat ()
	{

		categorie.retrieveCat(1);
	}
	@Test
	public void testRetriveAllCategorie ()
	{
		System.out.println (categorie.retrieveAllCat());
		
	}
	@Test
	public void testRetrieveAuthor ()
	{
		System.out.println("**********************retrieveaut****************");
		System.out.println(auteur.retrieveAut(2));
	}
	@Test
	public void testRetriveAllAuthor ()
	{
		System.out.println (auteur.retrieveAllCAut());
	}
	@Test
	public void testRetrieveouvrage ()
	{
		ouvrage.retrieveOuvrage(1);
	}
	@Test
	public void testRetriveAllouvrage ()
	{
		System.out.println("**********************retrievouv****************");
		System.out.println (ouvrage.retrieveAllOuvrage());
		
	}
	@Test
	public void testRetriveOuvrageByCategorie ()
	{
		System.out.println("**********************retrievouvbycategorie****************");
		System.out.println (categorie.getAllOuvragesNamesByCategorie(1));
		
	}
	
}
