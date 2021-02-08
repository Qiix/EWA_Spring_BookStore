package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Auteur;
import tn.esprit.spring.entity.Categorie;
import tn.esprit.spring.entity.Ouvrage;
import tn.esprit.spring.repository.CategorieRepository;
import tn.esprit.spring.repository.OuvrageRepository;
@Service
public class CategorieServiceImpl implements CategorieService{
	@Autowired
	CategorieRepository catRepository;
	@Autowired
	OuvrageServiceImpl ouvrage;
	@Autowired
	OuvrageRepository ouvRepository;
	private static final org.apache.logging.log4j.Logger l = LogManager.getLogger(CategorieServiceImpl.class);

	@Override
	public List<Categorie> retrieveAllCat() {
		List<Categorie> categorie = (List<Categorie>) catRepository.findAll();
		for (Categorie ouv : categorie)
		{
			l.info("categorie +++ : "+ouv);
		}
		return categorie;
	}

	@Override
	public Categorie addCategorie(Categorie u) {
		return catRepository.save(u);
	}

	@Override
	public void deleteCat (int id) {
		catRepository.deleteById(id);
		
	}

	@Override
	public Categorie updateCat(Categorie u) {
		return catRepository.save(u);
	}

	@Override
	public Optional<Categorie> retrieveCat (int id) {
		Optional<Categorie> u = catRepository.findById(id);
		l.info("Categorie !:"+u);
		return u;
	}

	@Transactional
	public void affecterCategorieAOuvrage(int catId, int ouvrageId) {
  
	Ouvrage o =  ouvRepository.findById(ouvrageId).get();
	Categorie c = catRepository.findById(catId).get();
 
    o.getCategorie().add(c);
       
    ouvRepository.save(o);
	
	}

	@Transactional
	public List<String> getAllOuvragesNamesByCategorie(int categorieId) {
		Categorie categorie = catRepository.findById(categorieId).get();
		List<String> ouvrageNames = new ArrayList<>();
		for(Ouvrage ouv : categorie.getOuvrage() ){
			ouvrageNames.add(ouv.getIntitule());
		}
		
		return ouvrageNames;
	}

}
