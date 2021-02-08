package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Auteur;
import tn.esprit.spring.entity.Categorie;
import tn.esprit.spring.entity.Ouvrage;
import tn.esprit.spring.repository.AuteurRepository;
import tn.esprit.spring.repository.CategorieRepository;
import tn.esprit.spring.repository.OuvrageRepository;
@Service
public class AuteurServiceImpl  implements AuteurService{
	@Autowired
	AuteurRepository autRepository;
	@Autowired
	OuvrageRepository ouvRepository;
	@Autowired
	AuteurRepository autRrepository;
	private static final org.apache.logging.log4j.Logger l = LogManager.getLogger(AuteurServiceImpl.class);
	@Override
	public List<Auteur> retrieveAllCAut() {
		List<Auteur> auteur = (List<Auteur>) autRepository.findAll();
		for (Auteur ouv : auteur)
		{
			l.info("Auteur +++ : "+ouv);
		}
		return auteur;
	}

	@Override
	public Auteur addAuteur(Auteur u) {
		return autRepository.save(u);
	}

	@Override
	public void deleteAut(long id) {
		autRepository.deleteById(id);
		
	}

	@Override
	public Auteur updateAut(Auteur u) {
		return autRepository.save(u);

	}

	@Override
	public Optional<Auteur> retrieveAut(long id) {
		Optional<Auteur> u = autRepository.findById(id);
		l.info("Auteur !:"+u);
		return u;
	}
	@Transactional
	public void affecterAuteurAOuvrage(int auteurId, int ouvrageId) {
  
	Ouvrage ouvrage =  ouvRepository.findById(ouvrageId).get();
	Auteur auteur = autRrepository.findById((long) auteurId).get();
 
    ouvrage.getAuteur().add(auteur);
       
    ouvRepository.save(ouvrage);
	
	}
}
