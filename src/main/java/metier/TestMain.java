package metier;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
		
		Console c1 = new Console ("Nintendo");
		Console c2 = new Console ("Playstation");
		Console c3 = new Console ("XBox");
		
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
		
		
		//Boutique b= new Boutique ()
	}

}
