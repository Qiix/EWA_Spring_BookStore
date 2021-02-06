package com.esprit.ewa.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class LignePanierPK implements Serializable {
    private static final long serialVersionUID = 46455L;

    private long idOuvrage;
    private long idPanier;
}
