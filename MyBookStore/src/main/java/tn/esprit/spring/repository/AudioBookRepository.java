package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.AudioBook;
@Repository
public interface AudioBookRepository   extends CrudRepository<AudioBook, Integer> {

}
