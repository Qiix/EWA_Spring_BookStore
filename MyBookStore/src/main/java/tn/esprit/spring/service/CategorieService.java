package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entity.Categorie;




public interface CategorieService {
	List <Categorie> retrieveAllCat();
	Categorie addCategorie(Categorie u);
	void deleteCat(int id);
	Categorie updateCat(Categorie u);
	Optional<Categorie> retrieveCat(int id);
	 void affecterCategorieAOuvrage(int catId, int ouvrageId) ;
	 public List<String> getAllOuvragesNamesByCategorie(int categorieId) ;
}
