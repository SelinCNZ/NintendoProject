package metier;

import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
		
		Console c1 = new Console ("Nintendo");
		Console c2 = new Console ("Playstation");
		Console c3 = new Console ("XBox");
		
		Jeu j1 = new Jeu ("Call Of Duty",c1);
		Jeu j2 = new Jeu ("Mario Kart",c1);
		Jeu j3 = new Jeu ("Pokemon",c3);
		Jeu j4 = new Jeu ("Naruto",c2);
		Jeu j5 = new Jeu ("Bataille Navale",c2);
		
		List <Jeu> listeJeuxToto;
		listeJeuxToto.add(j5);
		listeJeuxToto.add(j2);
		listeJeuxToto.add(j3);
		
		
		Client clientToto = new Client ("TUTU", "toto", listeJeuxToto);
		

	}

}
