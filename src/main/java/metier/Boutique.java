package metier;

import metier.Jeu;
import java.util.ArrayList;
import java.util.List;



public class Boutique {

private String nom;
private String adresse;
private List<Jeu> Jeux;
public Boutique(String nom, String adresse, List<Jeu> jeux) {
	super();
	this.nom = nom;
	this.adresse = adresse;
	Jeux = jeux;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public List<Jeu> getJeux() {
	return Jeux;
}
public void setJeux(List<Jeu> jeux) {
	Jeux = jeux;
}



	
	
}
