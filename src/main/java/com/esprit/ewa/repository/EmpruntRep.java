package com.esprit.ewa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.ewa.entities.Emprunt;
import com.esprit.ewa.entities.EmpruntPk;


@Repository
public interface  EmpruntRep extends JpaRepository<Emprunt, EmpruntPk>, CrudRepository<Emprunt ,EmpruntPk>{
	
@Query("SELECT count(*) FROM Emprunt WHERE renduu=0")
public int NbrEmpruntNonRendus();
//Au niveau de base de donnees, true=1, false=0


}
