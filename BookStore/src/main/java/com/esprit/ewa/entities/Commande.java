package com.esprit.ewa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_COMMANDE")
public class Commande implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// attributs
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="Commande_NUM")
	private Long num;
	
	@Column(name="Commande_dateOrdered")
	@Temporal(TemporalType.DATE)
	private Date dateOrdered;
	
	@Column(name="Commande_dateDelivered")
	@Temporal(TemporalType.DATE)
	private Date dateDelivered;
	
	@Column(name="Commande_status")
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	@Column(name="Commande_adress")
	private String adress;
	
	@Column(name="Commande_numTel")
	private String numTel;
	
	@Column(name="Commande_sousTotal")
	private Double sousTotal;
	
	@Column(name="Commande_fraisLivraison")
	private Double fraisLivraison;
	
	@Column(name="Commande_total")
	private Double total;
	
	@Column(name="Commande_paid")
	private Boolean paid;
	
	// relations 
	
	// To Add Later
	
	

	// Constructor(s)
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande(Long num, Date dateOrdered, Date dateDelivered, OrderStatus status, String adress, String numTel,
			Double sousTotal, Double fraisLivraison, Double total, Boolean paid) {
		super();
		this.num = num;
		this.dateOrdered = dateOrdered;
		this.dateDelivered = dateDelivered;
		this.status = status;
		this.adress = adress;
		this.numTel = numTel;
		this.sousTotal = sousTotal;
		this.fraisLivraison = fraisLivraison;
		this.total = total;
		this.paid = paid;
	}
	
	// Getters & Setters 

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public Date getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public Date getDateDelivered() {
		return dateDelivered;
	}

	public void setDateDelivered(Date dateDelivered) {
		this.dateDelivered = dateDelivered;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public Double getSousTotal() {
		return sousTotal;
	}

	public void setSousTotal(Double sousTotal) {
		this.sousTotal = sousTotal;
	}

	public Double getFraisLivraison() {
		return fraisLivraison;
	}

	public void setFraisLivraison(Double fraisLivraison) {
		this.fraisLivraison = fraisLivraison;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	
	// toString()
	
	@Override
	public String toString() {
		return "Commande [num=" + num + ", dateOrdered=" + dateOrdered + ", dateDelivered=" + dateDelivered
				+ ", status=" + status + ", adress=" + adress + ", numTel=" + numTel + ", sousTotal=" + sousTotal
				+ ", fraisLivraison=" + fraisLivraison + ", total=" + total + ", paid=" + paid + "]";
	}
	
	// hasCode()

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}

	
	// equals()
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commande other = (Commande) obj;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
