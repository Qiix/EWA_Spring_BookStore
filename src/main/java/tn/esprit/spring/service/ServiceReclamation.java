package tn.esprit.spring.service;


import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Reclamation;
import tn.esprit.spring.repository.ReclamationRepo;

@Service
public class ServiceReclamation implements InterReclamation {

	@Autowired
	ReclamationRepo rr;
	
	private static final Logger L = LogManager.getLogger(ServiceReclamation.class);
	
	
	@Override
	public List<Reclamation> afficherReclamations() {
		
		List<Reclamation> r = (List<Reclamation>) rr.findAll();
		for (Reclamation rec:r)
			L.info("reclamation+++"+rec.toString());
		
		return r;
		
		
	}

	
	@Override
	public Reclamation rechercherReclamation(int id) {
		
		L.info("Réclamation : ");
		L.info(rr.findById(id).orElse(null));
		return rr.findById(id).orElse(null);
		
	}

	@Override
	public Reclamation ajouterReclamation(Reclamation rec) {
		
		//L.info("Réclamation ajouté avec succès ");
		return rr.save(rec);
		
	}

	@Override
	public void supprimerReclamation(int id) {
		
		rr.deleteById(id);
		L.info("Réclamation supprimée avec succès");
		
	}

	@Override
	public Reclamation modifierReclamation(Reclamation rec) {
		
		L.info("Réclamation modifié avec succès");
		return rr.save(rec);
	}

}



