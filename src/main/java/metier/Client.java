package metier;

import java.util.List;

public class Client {

	protected String nom;
	protected String prenom;
	protected List <Achat> achatJeu;
	
	public Client(String nom, String prenom, List<Achat> achatJeu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.achatJeu = achatJeu;
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
		return "Client [nom=" + nom + ", prenom=" + prenom + ", achatJeu=" + achatJeu + "]";
	}

	

	
	
	
	
}
