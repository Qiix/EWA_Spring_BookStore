package tn.esprit.spring;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entity.AudioBook;
import tn.esprit.spring.entity.Auteur;
import tn.esprit.spring.entity.Categorie;
import tn.esprit.spring.entity.OuvrageNeuf;

import tn.esprit.spring.service.AuteurServiceImpl;
import tn.esprit.spring.service.CategorieServiceImpl;
import tn.esprit.spring.service.OuvrageServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
 public class BookApplicationTests {
	
	@Autowired
	CategorieServiceImpl categorie;
	@Autowired
	AuteurServiceImpl auteur;

	@Autowired
	OuvrageServiceImpl ouvrage;
	private static final Logger l = LogManager.getLogger(BookApplication.class);

	@Test
	public void contextLoads()  throws ParseException{
		
		Categorie d = new Categorie (8,"horreur");
	//	categorie.addCategorie(d);
	//	System.out.println("add categorie");
		Set<Auteur> setA = new HashSet <Auteur>();
		Auteur aut = new Auteur(14,"yousra","xxxx");
		setA.add(aut);
		//Auteur a = new Auteur (21,"victor","france");
		//auteur.addAuteur(a);
		//auteur.retrieveAllCAut();
        //id,date,desc,intit,isbn,prix,quant,link,quant,isavai
		Set<Categorie> set = new HashSet <Categorie>();
		//set.add(d);
      // AudioBook au = new AudioBook (1,"xxx","xxxx","xxxx",12,12,set,"xxxx");
		//audio.addAudioBook(au);
		OuvrageNeuf ev = new OuvrageNeuf(88,"12/02/2020","yousra","kkk",123654,12,25,set,setA);
		ouvrage.addOuvrage(ev);
		//OuvrageNeuf ouvN = new OuvrageNeuf(1,"pppppp","up","up",123,1,1,set);
		//ouvrage.updateOuvrageN(ouvN);
	//	ouvrage.deleteOuvrage(6);
	//	ouvrage.addOuvrage(ouvN);
	//	audio.deleteAud(1);
		//System.out.println("add categorie");	
	//	System.out.println (audio.retrieveAllCAudio());
		ouvrage.retrieveAllOuvrage();
		//System.out.println (audio.retrieveAudio(2));
	}
	
/*	@Test
	public void testRetriveAllCategorie ()
	{
		System.out.println (categorie.retrieveAllCat());		
	}*/
}
