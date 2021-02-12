package tn.esprit.spring.service;


import java.util.ArrayList;
import java.util.List;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entities.Reclamation;
import tn.esprit.spring.repository.ReclamationRepo;

@Service
public class RecServiceImpl implements RecService {

	@Autowired
	ReclamationRepo rr;
	
	//private static final Logger L = LogManager.getLogger(ServiceReclamation.class);
	
	
	@Override
	public List<Reclamation> afficherReclamations() {
		
		List<Reclamation> r = new ArrayList<Reclamation>();
		
		rr.findAll().forEach(c -> r.add(c));
		
		return r;
		
		
	}

	
	@Override
	public Reclamation rechercherReclamation(int id) {
		
		return rr.findById(id).get();
		
	}

	@Override
	public Reclamation ajouterReclamation(Reclamation rec) {
	
		return rr.save(rec);
		
	}

	@Override
	public void supprimerReclamation(int id) {
		
		rr.deleteById(id);	
	}

	@Override
	public Reclamation modifierReclamation(Reclamation rec) {
	
		return rr.save(rec);
	}

}



