package com.esprit.ewa.entities;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class LignePanier implements Serializable {
    private static final long serialVersionUID = 31315L;

    @EmbeddedId
    private LignePanierPK lignePanierPK;

    private int nbExemplaires;

    @Formula("select prix from Ouvrage o where o.id = idOuvrage")
    private double prixUnitaire;

    @Formula("prixUnitaire * nbExemplaires")
    private double prix;

    //relations here


    public void setLignePanierPK(LignePanierPK lignePanierPK) {
        this.lignePanierPK = lignePanierPK;
    }

    public void setNbExemplaires(int nbExemplaires) {
        this.nbExemplaires = nbExemplaires;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


    public LignePanierPK getLignePanierPK() {
        return lignePanierPK;
    }

    public int getNbExemplaires() {
        return nbExemplaires;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public double getPrix() {
        return prix;
    }



}
