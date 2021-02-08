	package tn.esprit.spring.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Typeouvrage")
public abstract  class Ouvrage {
	
private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idOuvrage;
	@Column
    private int isbn;
	@Column
    private String intitule;
	@Column
    private String dateSortie;
	@Column
    private int quantite;
	@Column
    private double prix;
	@Column
	private String description ;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Categorie> categorie;
	
	public Set<Categorie> getCategorie() {
		return categorie;
	}

	public void setCategorie(Set<Categorie> categorie) {
		this.categorie = categorie;
	}

	public Set<Auteur> getAuteur() {
		return auteur;
	}

	public void setAuteur(Set<Auteur> auteur) {
		this.auteur = auteur;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Auteur> auteur;
	
	
    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Ouvrage() {
    }

	public int getIdOuvrage() {
		return idOuvrage;
	}

	public void setIdOuvrage(int idOuvrage) {
		this.idOuvrage = idOuvrage;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Ouvrage [idOuvrage=" + idOuvrage + ", isbn=" + isbn + ", intitule=" + intitule + ", dateSortie="
				+ dateSortie + ", quantite=" + quantite + ", prix=" + prix + ", description=" + description + "]";
	}



	public Ouvrage(int idOuvrage2, String dateSortie2, String description2, String intitule2, int isbn2, double prix2,Set<Categorie> categorie,Set<Auteur> auteur) {
	this.idOuvrage = idOuvrage2;
	this.dateSortie=dateSortie2;
	this.description = dateSortie2;
	this.intitule=intitule2;
	this.isbn=isbn2;
	this.prix=prix2;
	this.categorie=categorie;
	this.auteur = auteur;
	}
	
	public Ouvrage(int idOuvrage2, String dateSortie2, String description2, String intitule2, int isbn2, double prix2,int quantite,Set<Categorie> categorie,Set<Auteur> auteur) {
		this.idOuvrage = idOuvrage2;
		this.dateSortie=dateSortie2;
		this.description = dateSortie2;
		this.intitule=intitule2;
		this.isbn=isbn2;
		this.prix=prix2;
		this.quantite=quantite;
		this.categorie=categorie;
		this.auteur = auteur;
		}

	

  
}
