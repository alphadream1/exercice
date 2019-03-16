package monpackage;

public class Depart {

	// Method lancée au démarage. A génerer.
	public static void main(String[] args) {
		System.out.println("first"); // instruction qui permet d'ecrire dans la console

		// appel de la methode exo1
		// exo1();

		// appel de la methode exo3
		// exo3(6);

		// appel methode sub
		// sub(12, 2);

		// appel methode multiplyAndAdd
		// multiplyAndAdd(2, 2, 2);
		// test sortie console pour voire si ma methode fonctionne
		// System.out.println(multiplyAndAdd(2, 2, 2));
	}

	// debut exo1
	// void veux dire que ca ne retourne pas de resultat
	public static void exo1() {
		int i = 7;
		int j = 3;
		int division = i / j;
		System.out.println("resultat de la division de i par j = " + division);
		int reste = i % j;
		System.out.println("le reste de la division de i par j = " + reste);
		double d2 = (double) i / j;
		System.out.println("la division classique de i par j = " + d2);
		double addition = division + reste + d2;
		System.out.println("la somme des 3 premiers resultat = " + addition);
	}

	// debut exo3
	public static void exo3(int nombre) {
		System.out.println("parametre de exo3 : " + (nombre + 5));
	}

	// debut sub
	public static void sub(int Nbre1, int Nbre2) {
		System.out.println("resultat de la soustraction : " + (Nbre1 - Nbre2));
	}

	// debut multiplyAndAdd
	// return veux dire que l'on veux retourner le resultat
	public static int multiplyAndAdd(int a, int b, int c) {
		return a * (b + c);
	}

}
