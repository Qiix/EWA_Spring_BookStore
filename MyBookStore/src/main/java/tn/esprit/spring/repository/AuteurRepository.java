package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Auteur;
import tn.esprit.spring.entity.Categorie;

@Repository
public interface AuteurRepository  extends CrudRepository<Auteur, Long> {

}
