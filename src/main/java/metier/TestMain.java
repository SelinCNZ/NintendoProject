package metier;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
		Console c1 = new Portable ("Nintendo");
		Console c2 = new Salon ("Playstation");
		Console c3 = new Salon ("XBox");
		
		List <Console> consoles = new ArrayList();
		
		consoles.add(c3);
		consoles.add(c2);
		consoles.add(c1);
		
		Jeu j1 = new Jeu ("Call Of Duty",consoles);
		Jeu j2 = new Jeu ("Mario Kart",consoles);
		Jeu j3 = new Jeu ("Pokemon",consoles);
		Jeu j4 = new Jeu ("Naruto",consoles);
		Jeu j5 = new Jeu ("Bataille Navale",consoles);
		
		
		List<Jeu> jeux= new ArrayList<Jeu>();
		jeux.add(j5);
		jeux.add(j4);
		jeux.add(j3);
		jeux.add(j2);
		jeux.add(j1);
		
		Boutique b= new Boutique ("Micromania","42 passage John Doe",jeux);
		
		List <Jeu> listeJeuxToto;
		listeJeuxToto.add(j5);
		listeJeuxToto.add(j2);
		listeJeuxToto.add(j3);
		Client clientToto = new Client ("TUTU", "toto", listeJeuxToto);
	}

}
