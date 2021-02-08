package tn.esprit.spring;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entity.AudioBook;
import tn.esprit.spring.entity.Auteur;
import tn.esprit.spring.entity.Categorie;
import tn.esprit.spring.entity.OuvrageEmpruntable;
import tn.esprit.spring.entity.OuvrageNeuf;
import tn.esprit.spring.entity.OuvrageOccasion;
import tn.esprit.spring.service.AuteurServiceImpl;
import tn.esprit.spring.service.CategorieServiceImpl;
import tn.esprit.spring.service.OuvrageServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAdd {

	@Autowired
	AuteurServiceImpl auteur;
	@Autowired
	OuvrageServiceImpl ouvrage;
	@Autowired
	CategorieServiceImpl categorie;
	
	@Test
	public void testAddouvrage ()
	{
		System.out.println("**********************add****************");
		Set<Categorie> set = new HashSet <Categorie>();
		Categorie c = new Categorie (1,"histoire");
		set.add(c);
		//Object e = categorie.retrieveCat("4");
		//Categorie c = (Categorie) e;
		//set.add(c);
		Set<Auteur> setA = new HashSet <Auteur>();
		Auteur aut = new Auteur(1,"yousra","xxxx");
		setA.add(aut);
		AudioBook au = new AudioBook (1,"12/03/2021","xxxx","abcd",12,12.0,set,"xxxx",setA);
		OuvrageNeuf ev = new OuvrageNeuf(2,"12/02/2020","aaaa","efg",123654,16.0,25,set,setA);
		OuvrageOccasion o = new OuvrageOccasion(3,"12/02/2020","aaaa","hij",123654,19.0,25,set,setA);
		OuvrageEmpruntable em = new OuvrageEmpruntable(4,"12/02/2020","aaaa","kkk",123654,12.3,25,set,true,setA);
		ouvrage.addOuvrage(au);
		ouvrage.addOuvrage(ev);
		ouvrage.addOuvrage(o);
		ouvrage.addOuvrage(em);


	}
	
	@Test
	public void testAddCategorie ()
	{
		Categorie c = new Categorie (2,"horreur");
		categorie.addCategorie(c);
		System.out.println("add categorie");
	}
	
	@Test
	public void testAddAuthor ()
	{
		System.out.println("**********************add****************");
		Auteur a = new Auteur (2,"victor","france");
				auteur.addAuteur(a);
	}
	@Test
	public void testAffectCatOuv ()
	{
		categorie.affecterCategorieAOuvrage(2,4);
	}
	@Test
	public void testAffectAuteurOuvrage ()
	{
		auteur.affecterAuteurAOuvrage(1, 1);
	}
	
}
