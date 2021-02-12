package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name = "Client")

public class Client implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="cin")
	private int cin;

	@Column(name="phone")
	private String numTel;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String pwd;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
	private Set<Reclamation> reclamations;
	

	public Client() {}
	
	public Client(String nom, String prenom, String email, String pwd, int cin, String numTel) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pwd = pwd;
		this.cin = cin;
		this.numTel = numTel;
	}
	
	public Client(String nom, String prenom, String email, String pwd, int cin, String numTel, Set<Reclamation> r) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pwd = pwd;
		this.cin = cin;
		this.numTel = numTel;
		this.reclamations=r;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	public Set<Reclamation> getReclamation() {
		return reclamations;
	}
	public void setDepartement(Set<Reclamation> r) {
		this.reclamations = r;
	}

	
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", numTel=" + numTel
				+ ", email=" + email + ", pwd=" + pwd + ", reclamations=]";
	}
	
	
}
