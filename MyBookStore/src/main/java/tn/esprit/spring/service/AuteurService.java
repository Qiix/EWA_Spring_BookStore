package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entity.Auteur;
import tn.esprit.spring.entity.Categorie;

public interface AuteurService {
	List <Auteur> retrieveAllCAut();
	Auteur addAuteur(Auteur u);
	void deleteAut(long id);
	Auteur updateAut(Auteur u);
	Optional<Auteur> retrieveAut(long id);
}
