package monpackage;

import java.util.Scanner;

public class exo3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("veuillez entrer le 1er coté :");
		int c1 = scanner.nextInt();

		System.out.println("veuillez entrer le 1er coté :");
		int c2 = scanner.nextInt();

		System.out.println("l'hypothenuse : " + pythagore(c1, c2));

		scanner.close();
	}

	// c1 et c2 en entrées
	// sortie :
	public static double pythagore(int c1, int c2) {
		return Math.sqrt(c1 * c1 + c2 * c2);

	}
	// slide 46 -> i=1 k=2 : deuxieme ligne i=2 j=3
	// slide 48 -> affiche "i=1 k=5" et retourne 6 donc j=6 / affiche "i=1 k=5" et
	// retourne 6 donc j=6 / affiche "i=5 j=6"
}
