package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Categorie;
@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Integer>  {

}
