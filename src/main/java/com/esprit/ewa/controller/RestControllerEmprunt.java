package com.esprit.ewa.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.ewa.entities.Emprunt;
import com.esprit.ewa.service.EmpruntService;



@RestController
public class RestControllerEmprunt {
	@Autowired
	EmpruntService empruntService;
	

	@PostMapping( value ="/ajouterEmprunt/{clientId}/{ouvrageEmpId}/{dateDebut}/{dateFin}/{rendu}")
	@ResponseBody
	public void ajouterTimesheet(@PathVariable("clientId") int clientId,@PathVariable("ouvrageEmpId") int ouvrageEmpId,@PathVariable("dateDebut") String dateDebut,@PathVariable("dateFin") String dateFin,@PathVariable("rendu") boolean rendu) throws ParseException {
		empruntService.AjouterEmprunt(clientId, ouvrageEmpId, dateDebut, dateFin,rendu);
	}
	
	@GetMapping("/AfficherTtLesEmprunts")
	@ResponseBody
	public List<Emprunt> AfficherTtLesEmprunts()
	{
		List<Emprunt> emprunts = empruntService.AfficherTtLesEmprunts();
		return emprunts;
	}
	
	@GetMapping(value ="/NbrEmpruntNonRendus")
	@ResponseBody
	public int CalculerEmprunts()
	{
    int nb = empruntService.NbrEmpruntNonRendus();
	return nb;
	}
	
	
	@GetMapping("/AfficherEmprunt/{clientId}/{ouvrageEmpId}/{dateDebut}/{dateFin}")
	@ResponseBody
	 public String AfficherEmprunt(@PathVariable("clientId") int clientId,@PathVariable("ouvrageEmpId") int ouvrageEmpId,@PathVariable("dateDebut") String dateDebut,@PathVariable("dateFin") String dateFin) throws ParseException {
	 return empruntService.AfficherEmpruntParId(clientId, ouvrageEmpId, dateDebut, dateFin);
	 }
	

	@DeleteMapping("/SupprimerTtLesEmprunts")
	@ResponseBody
	 public void SupprimerTtLesEmprunts()
	 {
		empruntService.SupprimerTtLesEmprunts();
	 }

	@DeleteMapping("/SupprimerEmprunt/{clientId}/{ouvrageEmpId}/{dateDebut}/{dateFin}")
	@ResponseBody
	public void SupprimerEmprunt(@PathVariable("clientId") int clientId,@PathVariable("ouvrageEmpId") int ouvrageEmpId,@PathVariable("dateDebut") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateDebut,@PathVariable("dateFin") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateFin) 
			throws ParseException {
		empruntService.SupprimerEmprunt(clientId, ouvrageEmpId, dateDebut, dateFin);
	}
			
	@PutMapping("/ModifierEmprunt/{clientId}/{ouvrageEmpId}/{dateDebut}/{dateFin}/{rendu}")
	@ResponseBody
	public void ModifierEmprunt(@PathVariable("clientId") int clientId,@PathVariable("ouvrageEmpId") int ouvrageEmpId,@PathVariable("dateDebut") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateDebut,@PathVariable("dateFin") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateFin,@PathVariable("rendu") boolean rendu) throws ParseException {
		empruntService.ModifierEmprunt(clientId, ouvrageEmpId, dateDebut, dateFin, rendu);
	}
	

}
