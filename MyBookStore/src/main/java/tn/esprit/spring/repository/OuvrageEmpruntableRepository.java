package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.OuvrageEmpruntable;


@Repository
public interface OuvrageEmpruntableRepository extends CrudRepository<OuvrageEmpruntable, Integer> {

}
