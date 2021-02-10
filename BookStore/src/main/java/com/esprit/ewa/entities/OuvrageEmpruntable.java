package com.esprit.ewa.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("OuvrageEmpruntable")
public class OuvrageEmpruntable extends Ouvrage {

	
	@Column
	private boolean isAvailable;

	public OuvrageEmpruntable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OuvrageEmpruntable(int idOuvrage2, String dateSortie2, String description2, String intitule2, int isbn2,
			double prix2, int quantite, Set<Categorie> categorie,boolean isAvailable,Set<Auteur> auteur) {
		super(idOuvrage2, dateSortie2, description2, intitule2, isbn2, prix2, quantite, categorie,auteur);
		this.isAvailable = isAvailable;
	}

/*	public OuvrageEmpruntable(int i, String string, String string2, String string3, int j, int k, int l,
			Set<Categorie> set, boolean b) {
		// TODO Auto-generated constructor stub
	}*/

	
	
	
	
}
