package monpackage;

import java.util.Random;

public class ArrayUtils {

	public static void main() {

//		int[] toto = new int[5];
//		int[] tata = new int[5];
//		int[] tutu = new int[] { 12, 25, 50, 23, 36, 50, 1, 23, 45, 50 };
//		int[] classer1 = new int[] { 11, 22, 33, 44, 55 };
//		int[] classer2 = new int[] { 15, 26, 28, 62, 87 };

//		fillTab(toto);
//		printTab(toto);
//		int max = getMax(toto);
//		System.out.println("max = " + max);
//		permute(toto, 1, 3);
//		printTab(toto);
//		System.out.println(somme(toto));
//		System.out.println(moyenne(toto));
//		supMoyenne(toto);
//		System.out.println(nbreValeuMax(toto));
//		fillTab(tata);
//		printTab(fusion(toto, tata));
//		sortTab(toto);
//		System.out.println();
//		sortTab2(toto);
//		System.out.println();
//		printTab(fusionSortTab(classer1, classer2));
//		System.out.println(NbreValeurMaxV2(tutu));

		// calculPerformance();

//		printTab(fusionSortTabV2(classer1, classer2));

	}

	// remplir le tableau
	public static void fillTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new Random().nextInt(100);
		}
	}

	// ecrire le tableau dans la console
	public static void printTab(int[] tab) {
		// commenter ma solution qui ecrit le tableau sous forme de tableau
		// [nbre,nbre,nbre,nbre,nbre]
		// System.out.println(Arrays.toString(tab));
		String tableau = "";
		for (int i = 0; i < tab.length; i++) {
			tableau += tab[i] + " ";
		}
		System.out.println(tableau);
	}

	// retourne la plus grande valeur du tableau
	public static int getMax(int[] tab) {
		int valeurMax = Integer.MIN_VALUE;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > valeurMax) {
				valeurMax = tab[i];
			}
		}
		return valeurMax;
	}

	// permute l'emplacement entre i et j
	public static void permute(int[] tab, int i, int j) {
		int stock = tab[i];
		tab[i] = tab[j];
		tab[j] = stock;
	}

	// la somme des element du tableau
	public static int somme(int[] tab) {
		int somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		return somme;
	}

	// retourne la moyenne
	public static double moyenne(int[] tab) {
		return somme(tab) / (double) tab.length;
	}

	// affiche les valeur superieur a la moyenne
	public static void supMoyenne(int[] tab) {
		double moyenne = moyenne(tab);
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > moyenne) {
				System.out.println(tab[i]);
			}
		}
	}

	// affiche combien de fois apparait la valeur max dans le tableau en version
	// "o(2n)"
	public static int nbreValeuMax(int[] tab) {
		int compteur = 0;
		int max = getMax(tab);
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == max) {
				compteur++;
			}
		}
		return compteur;
	}

	// afficher combien de fois apparait la valeur max dans le tableau en version
	// "o(n)"
	public static int NbreValeurMaxV2(int[] tab) {
		int compteur = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
				compteur = 1;
			} else if (tab[i] == max) {
				compteur++;
			}
		}
		return compteur;
	}

	// Crée et retourne un nouveau tableau qui est la concaténationdes 2 tableaux
	public static int[] fusion(int[] tab1, int[] tab2) {
		int[] newTab = new int[tab1.length + tab2.length];
		for (int i = 0; i < tab1.length; i++) {
			newTab[i] = tab1[i];
		}
		for (int i = 0; i < tab2.length; i++) {
			newTab[i + tab1.length] = tab2[i];
		}
		return newTab;
	}

	// trié le tableau en ordre croisant
	public static void sortTab(int[] tab) {
		int stock;
		for (int j = 0; j < tab.length - 1; j++) {
			for (int i = 0; i < tab.length; i++) {
				if (i == tab.length - 1) {
					break;
				} else if (tab[i] > tab[i + 1]) {
					stock = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = stock;
				}
			}
		}
		// for (int i = 0; i < tab.length; i++) {
		// System.out.print(tab[i] + " ");
		// }
	}

	// trié dans l'ordre decroissant
	public static void sortTab2(int[] tab) {
		int stock;
		for (int j = tab.length - 1; j > 0; j--) {
			for (int i = tab.length - 1; i >= 0; i--) {
				if (i == 0) {
					break;
				} else if (tab[i] > tab[i - 1]) {
					stock = tab[i];
					tab[i] = tab[i - 1];
					tab[i - 1] = stock;
				}
			}
		}
		// for (int i = 0; i < tab.length; i++) {
		// System.out.print(tab[i] + " ");
		// }
	}

	// Crée et retourne un tableau trié qui est la fusion des 2 tableaux triés
	public static int[] fusionSortTab(int[] sortTab1, int[] sortTab2) {
		int[] newTab = new int[sortTab1.length + sortTab2.length];

		// newTab = fusion(sortTab1, sortTab2);
		// sortTab(newTab);

		// concatenation
		for (int i = 0; i < sortTab1.length; i++) {
			newTab[i] = sortTab1[i];
		}
		for (int i = 0; i < sortTab2.length; i++) {
			newTab[i + sortTab1.length] = sortTab2[i];
		}
		// trie par ordre croissant
		int stock;
		for (int j = 0; j < newTab.length - 1; j++) {
			for (int i = 0; i < newTab.length; i++) {
				if (i == newTab.length - 1) {
					break;
				} else if (newTab[i] > newTab[i + 1]) {
					stock = newTab[i];
					newTab[i] = newTab[i + 1];
					newTab[i + 1] = stock;
				}
			}
		}
		// for (int i = 0; i < newTab.length; i++) {
		// System.out.print(newTab[i] + " ");
		// }
		return newTab;
	}

	public static int[] fusionSortTabV2(int[] sortTab1, int[] sortTab2) {
		int[] newTab = new int[sortTab1.length + sortTab2.length];
		int iT1 = 0;
		int iT2 = 0;
		for (int i = 0; i < newTab.length; i++) {
			if (iT1 >= sortTab1.length) {
				newTab[i] = sortTab2[iT2];
				iT2++;
			} else if (iT2 >= sortTab2.length) {
				newTab[i] = sortTab1[iT1];
				iT1++;
			} else if (sortTab1[iT1] <= sortTab2[iT2]) {
				newTab[i] = sortTab1[iT1];
				iT1++;
			} else if (sortTab2[iT2] <= sortTab1[iT1]) {
				newTab[i] = sortTab2[iT2];
				iT2++;
			}
		}
		return newTab;
	}

	public static void calculPerformance() {
		int[] tab = new int[1000000];

		fillTab(tab);

		long time = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			nbreValeuMax(tab);
		}
		time = System.currentTimeMillis() - time;
		System.out.println("nbOccurenceMax : " + time);

		time = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			NbreValeurMaxV2(tab);
		}
		time = System.currentTimeMillis() - time;
		System.out.println("nbOccurenceMaxV2 : " + time);

	}

}
