package drapeauTricolor;

import java.util.Random;

public class Drapeau {

	public static void main(String[] args) {

		int[] tabCouleur = new int[15];

		fillTabCouleur(tabCouleur);
		printTabCouleur(tabCouleur);
		sortTricolorTab(tabCouleur);
		printTabCouleur(tabCouleur);
	}

	public static void fillTabCouleur(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new Random().nextInt(3);
		}
	}

	public static void printTabCouleur(int[] tab) {
		String tableau = "";
		for (int i = 0; i < tab.length; i++) {
			tableau += tab[i] + " ";
		}
		System.out.println(tableau);
	}

	public static void sortTricolorTab(int[] tab) {
//		int index1 = 0;
//		int index2 = tab.length - 1;

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == 0) {

			}
		}
	}
}