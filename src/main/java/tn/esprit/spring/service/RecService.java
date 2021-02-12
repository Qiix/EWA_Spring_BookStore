package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Reclamation;

public interface RecService {

	
	public List<Reclamation> afficherReclamations();
	public Reclamation rechercherReclamation (int id);
	public Reclamation ajouterReclamation (Reclamation rec);
	public void supprimerReclamation (int id);
	public Reclamation modifierReclamation (Reclamation rec);
	
}
