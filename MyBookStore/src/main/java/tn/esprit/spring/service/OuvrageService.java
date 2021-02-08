package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entity.AudioBook;
import tn.esprit.spring.entity.Ouvrage;
import tn.esprit.spring.entity.OuvrageEmpruntable;
import tn.esprit.spring.entity.OuvrageNeuf;
import tn.esprit.spring.entity.OuvrageOccasion;

public interface OuvrageService {
	//Ouvrage addOuvrage(Ouvrage u);
	OuvrageNeuf addOuvrage(OuvrageNeuf u);
	OuvrageOccasion addOuvrage(OuvrageOccasion u);
	OuvrageEmpruntable addOuvrage(OuvrageEmpruntable u);
	AudioBook addOuvrage(AudioBook u);

	
	
	
	void deleteOuvrage(int id);
	List <Ouvrage> retrieveAllOuvrage();
	Optional<Ouvrage> retrieveOuvrage(int id);
	Ouvrage updateOuvrageA(AudioBook u);
	Ouvrage updateOuvrageN(OuvrageNeuf u);
	Ouvrage updateOuvrageO(OuvrageOccasion u);
	Ouvrage updateOuvrageE(OuvrageEmpruntable u);



}
