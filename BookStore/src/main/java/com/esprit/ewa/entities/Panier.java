package com.esprit.ewa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Panier implements Serializable {

    private static final long serialVersionUID = 45658L;

    @Id
    private Long id;

    private double total=0;

    //relations here


    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
