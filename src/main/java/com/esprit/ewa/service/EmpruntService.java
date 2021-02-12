package com.esprit.ewa.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.esprit.ewa.entities.Emprunt;


public interface EmpruntService {
	public void AjouterEmprunt(int clientId, int ouvrageEmpId, String dateDebut, String dateFin, boolean rendu) throws ParseException;
	public List<Emprunt> AfficherTtLesEmprunts();
	public String AfficherEmpruntParId(int clientId, int ouvrageEmpId, String dateDebut, String dateFin) throws ParseException;
	public int NbrEmpruntNonRendus();
	public void SupprimerEmprunt(int clientId, int ouvrageEmpId, Date dateDebut, Date dateFin) throws ParseException;
	public void SupprimerTtLesEmprunts();
	public void ModifierEmprunt(int clientId, int ouvrageEmpId, Date dateDebut, Date dateFin, boolean rendu) throws ParseException;
}
