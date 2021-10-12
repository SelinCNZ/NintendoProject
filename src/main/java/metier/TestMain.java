package metier;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
		Console c1 = new Portable ("Nintendo",14,"2021-09-15");
		Console c2 = new Salon ("Playstation",67,"2021-08-15");
		Console c3 = new Salon ("XBox",45,"2021-09-27");
		
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
		Achat a1 = new Achat(j1,"2021-09-27",13,b);
		Achat a2 = new Achat(j2,"2021-09-27",13,b);
		Achat a3 = new Achat(j3,"2021-09-27",13,b);
		
		
		List <Achat> AchatJeuxToto = new ArrayList<Achat>();
		AchatJeuxToto.add(a1);
		AchatJeuxToto.add(a2);
		AchatJeuxToto.add(a3);
		Client clientToto = new Client ("TUTU", "toto", AchatJeuxToto);
	}

}
