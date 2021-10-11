package metier;

import java.util.List;

public class Client {

	protected String nom;
	protected String prenom;
	protected List <Jeu> jeu;
	
	public Client(String nom, String prenom, List<Jeu> jeu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.jeu = jeu;
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

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", jeu=" + jeu + "]";
	}

	
	
	
}
