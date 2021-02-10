package com.esprit.ewa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class EmpruntPk implements Serializable{
	private static final long serialVersionUID = 5377539445871317492L;
	
	private int idOuvrageEmpruntable;
	private int idClient;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	public EmpruntPk()
	{}

	public int getIdOuvEmp() {
		return idOuvrageEmpruntable;
	}

	public void setIdOuvEmp(int idOuvrageEmpruntable) {
		this.idOuvrageEmpruntable = idOuvrageEmpruntable;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateDebut == null) ? 0 : dateDebut.hashCode());
		result = prime * result + ((dateFin == null) ? 0 : dateFin.hashCode());
		result = prime * result + idClient;
		result = prime * result + idOuvrageEmpruntable;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpruntPk other = (EmpruntPk) obj;
		if (dateDebut == null) {
			if (other.dateDebut != null)
				return false;
		} else if (!dateDebut.equals(other.dateDebut))
			return false;
		if (dateFin == null) {
			if (other.dateFin != null)
				return false;
		} else if (!dateFin.equals(other.dateFin))
			return false;
		if (idClient != other.idClient)
			return false;
		if (idOuvrageEmpruntable != other.idOuvrageEmpruntable)
			return false;
		return true;
	}

	public EmpruntPk(int idOuvrageEmpruntable, int idClient, Date dateDebut, Date dateFin) {
		this.idOuvrageEmpruntable = idOuvrageEmpruntable;
		this.idClient = idClient;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
}
