package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.AudioBook;
import tn.esprit.spring.entity.Ouvrage;
import tn.esprit.spring.entity.OuvrageEmpruntable;
import tn.esprit.spring.entity.OuvrageNeuf;
import tn.esprit.spring.entity.OuvrageOccasion;
import tn.esprit.spring.repository.AudioBookRepository;
import tn.esprit.spring.repository.OuvrageEmpruntableRepository;
import tn.esprit.spring.repository.OuvrageNeufRepository;
import tn.esprit.spring.repository.OuvrageOccassionRepository;
import tn.esprit.spring.repository.OuvrageRepository;
@Service
public class OuvrageServiceImpl implements OuvrageService {

	@Autowired
	OuvrageRepository ouvRepository;
	private static final org.apache.logging.log4j.Logger l = LogManager.getLogger(AuteurServiceImpl.class);
	@Autowired
	AudioBookRepository audioRepository;
	@Autowired
	OuvrageEmpruntableRepository empRepository;
	
	@Autowired
	OuvrageNeufRepository neufRepository;
	
	@Autowired
	OuvrageOccassionRepository occRepository;
	@Autowired
	OuvrageEmpruntableRepository emprRepository;
	
	/*@Override
	public Ouvrage addOuvrage(Ouvrage u) {
		return ouvRepository.save(u);

	}*/

	@Override
	public void deleteOuvrage(int id) {
		
		ouvRepository.deleteById(id);		

	}

	@Override
	public Ouvrage updateOuvrageA(AudioBook u) {
		return audioRepository.save(u);
	}

	@Override
	public List<Ouvrage> retrieveAllOuvrage() {
		List<Ouvrage> a = (List<Ouvrage>) ouvRepository.findAll();
		for (Ouvrage ouv : a)
		{
			l.info("Ouvrage +++ : "+ouv);
		}
		return a;
	}

	@Override
	public Optional<Ouvrage> retrieveOuvrage(int id) {
		Optional<Ouvrage> u = ouvRepository.findById(id);
		l.info("Ouvrage !:"+u);
		return u;
	}



	@Override
	public Ouvrage updateOuvrageN(OuvrageNeuf u) {
		return neufRepository.save(u);
	}

	@Override
	public Ouvrage updateOuvrageO(OuvrageOccasion u) {
		return occRepository.save(u);
	}

	@Override
	public Ouvrage updateOuvrageE(OuvrageEmpruntable u) {
		return emprRepository.save(u);
	}

	@Override
	public OuvrageNeuf addOuvrage(OuvrageNeuf u) {
		return neufRepository.save(u);
	}

	@Override
	public OuvrageOccasion addOuvrage(OuvrageOccasion u) {
		return occRepository.save(u);
	}

	@Override
	public OuvrageEmpruntable addOuvrage(OuvrageEmpruntable u) {
		return empRepository.save(u);
	}

	@Override
	public AudioBook addOuvrage(AudioBook u) {
		return audioRepository.save(u);
	}

}
