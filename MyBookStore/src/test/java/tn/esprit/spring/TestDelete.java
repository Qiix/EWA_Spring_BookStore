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
public class TestDelete {
	@Autowired
	AuteurServiceImpl auteur;
	@Autowired
	OuvrageServiceImpl ouvrage;
	@Autowired
	CategorieServiceImpl categorie;
	
	@Test
	public void testDeleteAuthor ()
	{
		System.out.println("**********************delete****************");
		auteur.deleteAut(1);
	}
	@Test
	public void testDeleteouvrage ()
	{
		System.out.println("**********************delete****************");
		ouvrage.deleteOuvrage(4);
	}
	@Test
	public void testDeleteCategorie ()
	{
		categorie.deleteCat(2);
	}

}
