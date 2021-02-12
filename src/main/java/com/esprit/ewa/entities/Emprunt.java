package com.esprit.ewa.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.esprit.ewa.entities.OuvrageEmpruntable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Emprunt implements Serializable{
	private static final long serialVersionUID = 3876346912862238239L;
	
	@EmbeddedId
	private EmpruntPk empruntPk;
	//4 champs
	
	/*@ManyToOne
    @JoinColumn(name = "idOuvrageEmpruntable", referencedColumnName = "quantite", insertable=false, updatable=false)
	@JsonIgnore*/
	private OuvrageEmpruntable ouvrageEmpruntable;
	
	/*@ManyToOne
    @JoinColumn(name = "idClient", referencedColumnName = "id", insertable=false, updatable=false)
	@JsonIgnore
	private Client client;*/
	
	private boolean renduu;

	
	public EmpruntPk getEmpruntPk() {
		return empruntPk;
	}

	public void setEmpruntPk(EmpruntPk empruntPk) {
		this.empruntPk = empruntPk;
	}

	public OuvrageEmpruntable getOuvrageEmpruntable() {
		return ouvrageEmpruntable;
	}

	public void setOuvrageEmpruntable(OuvrageEmpruntable ouvrageEmpruntable) {
		this.ouvrageEmpruntable = ouvrageEmpruntable;
	}

	/*public Client getClient() {
		return client;
	}*/

	/*public void setClient(Client client) {
		this.client = client;
	}*/

	public boolean isRenduu() {
		return renduu;
	}

	public void setRenduu(boolean renduu) {
		this.renduu = renduu;
	}
	public boolean getRenduu()
	{
		return renduu;
	}
	
	public Emprunt()
	{}

	/*public Emprunt(EmpruntPk empruntPk, OuvrageEmpruntable ouvrageEmpruntable, Client client, boolean renduu) {
		this.empruntPk = empruntPk;
		this.ouvrageEmpruntable = ouvrageEmpruntable;
		this.client = client;
		this.renduu = renduu;
	}*/

	

}
