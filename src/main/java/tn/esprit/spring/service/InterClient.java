package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Client;

public interface InterClient {

	public List<Client> afficherClients ();
	public Client rechercherClient(int id);
	public Client ajouterClient(Client c);
	public void supprimerClient(int id);
	public void modifierClient(Client c);
}
