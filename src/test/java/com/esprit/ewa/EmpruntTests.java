package com.esprit.ewa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.ewa.service.EmpruntService;


@RunWith(SpringRunner.class)

@SpringBootTest
class EmpruntTests {
	@Autowired
	EmpruntService empruntService;
	
	@Test
	public void AjouterEmprunt() throws ParseException 
	{/*
		empruntService.ajouterEmprunt(1,1,"20-12-1997","26-12-1997");
		*/
	}
	
	@Test
	public  void AfficherTtLesEmprunts()
	{
		/*empruntService.AfficherTtLesEmprunts();	*/
	}
	
	@Test
	public String AfficherEmprunt() throws ParseException
	{
	 return empruntService.AfficherEmpruntParId(1, 1,"1997-01-01","1997-01-01");
		
	}
	
	@Test
	public void supprimerTtLesEmprunts()
	{
		/*empruntService.SupprimerTtLesEmprunts();*/
	}
	
	@Test
	public void supprimerEmprunt() throws ParseException
	{
	/*	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dDebut = dateFormat.parse("1997-12-26");
		Date dFin = dateFormat.parse("1997-12-26");
		empruntService.SupprimerEmprunt(1, 1,dDebut,dFin);*/
	}
	
	@Test
	public void ModifierEmprunt() throws ParseException
	{
		/*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dDebut = dateFormat.parse("1997-12-26");
		Date dFin = dateFormat.parse("1997-12-26");
		empruntService.ModifierEmprunt(1, 1, dDebut, dFin, false);*/
	}
	
	
	@Test
	public int NbrEmpruntNonRendus()
	{
		return empruntService.NbrEmpruntNonRendus();
	}
	
}


