package com.esprit.ewa.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("OuvrageNeuf")
public class OuvrageNeuf extends Ouvrage{

	public OuvrageNeuf() {
		super();
		
	}
	

	public OuvrageNeuf(int idOuvrage2, String dateSortie2, String description2, String intitule2, int isbn2,
			double prix2, int quantite, Set<Categorie> categorie,Set<Auteur> auteur) {
		super(idOuvrage2, dateSortie2, description2, intitule2, isbn2, prix2, quantite, categorie,auteur);
	
	}

	
	
	


	

}
