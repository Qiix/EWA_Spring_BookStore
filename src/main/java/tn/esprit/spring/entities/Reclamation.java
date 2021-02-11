package tn.esprit.spring.entities;


import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="Reclamation")

public class Reclamation implements Serializable {


	private static final long serialVersionUID = 1L;
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="titre")
	private String titre;
	
	@Column(name="description")
	private String description;
	
	
	@ManyToOne
	@JoinColumn(name="Client_id")
	private Client client;
	
	
	public Reclamation() {}
	
	

	public Reclamation(String titre, String desc) {
		super();
		this.titre = titre;
		this.description = desc;
	}


	
	public Reclamation( String titre, String description, Client c) {
		super();
		this.titre = titre;
		this.description = description;
		this.client = c;
	}
	
	

	public Reclamation(int id, String titre, String description, Client c) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.client = c;
	}

	
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}


	public Client getClient() {
		return client;
	}

	public void setClient(Client c) {
		this.client = c;
	}



	@Override
	public String toString() {
		return "Reclamation [id=" + id + ", titre=" + titre + ", description=" + description + ", client=" + client.getId()
				+ "]";
	}

	
	
	
	
	

}