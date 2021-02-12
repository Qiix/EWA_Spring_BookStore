package com.esprit.ewa.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "auteur")
public class Auteur {
	@Id
	@Column
	private long id;
	@Column
	private String nom;
	@Column
	private String bio;
	
	public Auteur() {
		super();
	}

	public Auteur(long id, String nom, String bio, Set<Ouvrage> ouvrage) {
		super();
		this.id = id;
		this.nom = nom;
		this.bio = bio;
		this.ouvrage = ouvrage;
	}
	
	public Auteur(long id, String nom, String bio) {
		super();
		this.id = id;
		this.nom = nom;
		this.bio = bio;
	}

	@ManyToMany(mappedBy="auteur",cascade = CascadeType.ALL)
	private Set<Ouvrage> ouvrage;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	@Override
	public String toString() {
		return "Auteur [id=" + id + ", nom=" + nom + ", bio=" + bio + "]";
	}
	
}
