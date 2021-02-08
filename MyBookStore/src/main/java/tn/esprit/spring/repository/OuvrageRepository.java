package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Ouvrage;

@Repository
public interface OuvrageRepository  extends CrudRepository<Ouvrage, Integer> {

}
