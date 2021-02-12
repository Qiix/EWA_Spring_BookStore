package tn.esprit.spring.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Reclamation;

@Repository
public interface ReclamationRepo extends CrudRepository <Reclamation,Integer>{
	
	/*@Modifying
	@Transactional
	@Query(value="INSERT INTO reclamation (titre,description,client_id) VALUES(:titre,:texte,:idClient)", nativeQuery=true)
	public void addReclamation
	(@Param("titre") String titre,@Param("texte") String texte,@Param("idClient") int c);
	
	@Query(value="select * from reclamation",nativeQuery=true)
	public List<Reclamation> getReclamations();*/
}
