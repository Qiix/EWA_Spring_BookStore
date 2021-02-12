package tn.esprit.spring.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.entities.Reclamation;

@Repository
public interface ReclamationRepo extends CrudRepository <Reclamation,Integer> {

}
