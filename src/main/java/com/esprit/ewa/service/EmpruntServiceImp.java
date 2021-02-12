package com.esprit.ewa.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.ewa.entities.Emprunt;
import com.esprit.ewa.entities.EmpruntPk;
import com.esprit.ewa.repository.EmpruntRep;


@Service
public class EmpruntServiceImp implements EmpruntService{
	@Autowired
	EmpruntRep empruntRep;
	
	private static final org.apache.logging.log4j.Logger l = LogManager.getLogger(EmpruntServiceImp.class);
	
	@Override
	public void AjouterEmprunt(int clientId, int ouvrageEmpId, String dateDebut, String dateFin, boolean rendu) throws ParseException {
	EmpruntPk empruntpk = new EmpruntPk();
	empruntpk.setIdClient(clientId);
	empruntpk.setIdOuvEmp(ouvrageEmpId);
	SimpleDateFormat SD = new SimpleDateFormat("yyyy-mm-dd");
	Date datedeb = SD.parse(dateDebut);
	Date dateF = SD.parse(dateFin);
	empruntpk.setDateDebut(datedeb);
	empruntpk.setDateFin(dateF);
	
	Emprunt emprunt = new Emprunt();
	emprunt.setEmpruntPk(empruntpk);
	emprunt.setRenduu(rendu);
	empruntRep.save(emprunt);
	}
	
	@Transactional
	public void ModifierEmprunt(int clientId, int ouvrageEmpId, Date dateDebut, Date dateFin, boolean rendu) throws ParseException{
		EmpruntPk empruntpk = new EmpruntPk();
		empruntpk.setIdClient(clientId);
		empruntpk.setIdOuvEmp(ouvrageEmpId);
		empruntpk.setDateDebut(dateDebut);
		empruntpk.setDateFin(dateFin);
		Emprunt emprunt =empruntRep.findById(empruntpk).get();
		emprunt.setRenduu(rendu);
		empruntRep.save(emprunt);
	}


	@Override
	public List<Emprunt> AfficherTtLesEmprunts() {
		List<Emprunt> emprunts= empruntRep.findAll();
		for(Emprunt e : emprunts)
		{
			l.info("Emprunt +++ : "+e);
		}
		return emprunts;
	}
	

	@Override
	public String AfficherEmpruntParId(int clientId, int ouvrageEmpId, String dateDebut, String dateFin)
			throws ParseException {
		EmpruntPk empruntpk = new EmpruntPk();
		empruntpk.setIdClient(clientId);
		empruntpk.setIdOuvEmp(ouvrageEmpId);
		SimpleDateFormat SD = new SimpleDateFormat("yyyy-mm-dd");
		Date datedeb = SD.parse(dateDebut);
		Date dateF = SD.parse(dateFin);
		empruntpk.setDateDebut(datedeb);
		empruntpk.setDateFin(dateF);
		Emprunt emprunt = (Emprunt) empruntRep.findById(empruntpk).get();
		return "Emprunt: \n Date de debut: "+empruntpk.getDateDebut().toLocaleString()+"\n Date de fin: "+empruntpk.getDateFin()+"\n Identifiant client: "+empruntpk.getIdClient()+"\n Identifiant ouvrage empruntable: "+empruntpk.getIdOuvEmp()+"\n Rendu: "+emprunt.getRenduu();
	}
	
	@Override
	public void SupprimerTtLesEmprunts() {
		empruntRep.deleteAll();

	}

	@Override
	public int NbrEmpruntNonRendus() {
		int nb = empruntRep.NbrEmpruntNonRendus();
	return nb;
	}

	@Override
	public void SupprimerEmprunt(int clientId, int ouvrageEmpId, Date dateDebut, Date dateFin)
			throws ParseException {
		EmpruntPk empruntpk = new EmpruntPk();
		empruntpk.setIdClient(clientId);
		empruntpk.setIdOuvEmp(ouvrageEmpId);
		empruntpk.setDateDebut(dateDebut);
		empruntpk.setDateFin(dateFin);
		Emprunt emprunt =empruntRep.findById(empruntpk).get();
		empruntRep.delete(emprunt);
	}
}
