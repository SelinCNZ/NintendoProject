package metier;

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
		

	}

}