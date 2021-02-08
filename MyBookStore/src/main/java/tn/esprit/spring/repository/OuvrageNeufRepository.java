package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.OuvrageNeuf;

@Repository
public interface OuvrageNeufRepository extends CrudRepository<OuvrageNeuf, Integer>{

}
