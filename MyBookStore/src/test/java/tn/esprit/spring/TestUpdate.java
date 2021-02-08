package tn.esprit.spring;

import java.util.HashSet;
import java.util.Optional;
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
public class TestUpdate {
	@Autowired
	AuteurServiceImpl auteur;
	@Autowired
	OuvrageServiceImpl ouvrage;
	@Autowired
	CategorieServiceImpl categorie;
	@Test
	public void testupdateAuthor ()
	{
		System.out.println("**********************update****************");
		Auteur a = new Auteur (1,"victorrrrr","france");
		auteur.updateAut(a);
	}
	@Test
	public void testupdateOuvrageE ()
	{
		Set<Categorie> set = new HashSet <Categorie>();
		Set<Auteur> setA = new HashSet <Auteur>();
		//Object e = categorie.retrieveCat("1");
		//set.add((Categorie) e);
		OuvrageEmpruntable em = new OuvrageEmpruntable(4,"12/02/2020","aaaa","kkk",123654,12,25,set,true,setA);
		ouvrage.updateOuvrageE(em);
	}
	@Test
	public void testupdateOuvrageN ()
	{
		Set<Categorie> set = new HashSet <Categorie>();
		Set<Auteur> setA = new HashSet <Auteur>();
	//	Object e = categorie.retrieveCat("1");
		//set.add((Categorie) e);
		OuvrageNeuf ev = new OuvrageNeuf(2,"12/02/2020","aaaa","kkk",123654,12,25,set,setA);
		ouvrage.updateOuvrageN(ev);
	}
	@Test
	public void testupdateOuvrageO ()
	{
		Set<Categorie> set = new HashSet <Categorie>();
		Set<Auteur> setA = new HashSet <Auteur>();
		//Object e = categorie.retrieveCat("1");
		//set.add((Categorie) e);
		OuvrageOccasion ev = new OuvrageOccasion(3,"12/02/2020","aaaa","kkk",123654,12,25,set,setA);
		ouvrage.updateOuvrageO(ev);
	}
	
	@Test
	public void testupdateOuvrageAudio ()
	{
		Set<Categorie> set = new HashSet <Categorie>();
		Set<Auteur> setA = new HashSet <Auteur>();
		
		
	//	Object e = categorie.retrieveCat("1");
	//set.add((Categorie) e);
		AudioBook au =new AudioBook (2,"12/02/2020","xxxx","xxxx",12,12,set,"xxxx",setA);
		ouvrage.updateOuvrageA(au);
	}
	@Test
	public void testupdateCat ()
	{
		Categorie c = new Categorie (1,"test");
		categorie.updateCat(c);
	}
}
