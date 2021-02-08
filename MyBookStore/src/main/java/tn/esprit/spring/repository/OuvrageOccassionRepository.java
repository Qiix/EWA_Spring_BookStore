package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.OuvrageOccasion;


@Repository
public interface OuvrageOccassionRepository extends CrudRepository<OuvrageOccasion, Integer>{

}
