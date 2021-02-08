package tn.esprit.spring.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AudioBook")
public class AudioBook extends Ouvrage{

	
	
	@Column
	private String link ;

	/*public AudioBook(int idOuvrage, int isbn, String intitule, String dateSortie, int quantite, double prix,
			String description, String link) {
		super(idOuvrage, isbn, intitule, dateSortie, quantite, prix, description);
		
		this.link = link;
	}*/
	//id,date,desc,intit,isbn,prix,quant,link,quant,isavai
	public AudioBook(int idOuvrage,String dateSortie,String description,String intitule,int isbn,double prix,Set<Categorie> categorie,String link,Set<Auteur> auteur)
	{
		super ( idOuvrage,dateSortie, description, intitule, isbn,prix,categorie,auteur);
		this.link = link;
	}
	public AudioBook ()
	{
		super();
	}
	
}
