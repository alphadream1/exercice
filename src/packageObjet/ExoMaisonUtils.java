package packageObjet;

import java.util.Random;

public class ExoMaisonUtils {

	public static void main(String[] args) {

		// travail objet
		MaisonBean m = new MaisonBean();
		m.setLongeur(25);
		m.setLargeur(12);

		printMaison(m);
		doubleMaison(m);
		printMaison(m);

		MaisonBean m2 = new MaisonBean();
		m2.setLongeur(30);
		m2.setLargeur(15);

		MaisonBean plusgrand = bigMaison(m, m2);
		System.out.println("Maison la plus grande :" + plusgrand);

		// -------------------------------------------
		// travail tableau d'objet

		MaisonBean[] maisonTab = new MaisonBean[5];

		createMaisons(maisonTab);
		printMaisons(maisonTab);
		System.out.println("la maison la plus grande est : " + bigMaisons(maisonTab));

	}

	// travail d'objet

//	Affiche la largeur, longueur de la maison : 12x25

	public static void printMaison(MaisonBean m) {
		if (m == null) {
			System.out.println(m);

		} else {
			System.out.println(m + " : " + m.getLargeur() + "x" + m.getLongeur());
		}
	}

	/** Double la taille de la maison */
	public static void doubleMaison(MaisonBean m) {
		if (m != null) {
			m.setLargeur(m.getLargeur() * 2);
			m.setLongeur(m.getLongeur() * 2);
		}
	}

	/** Retourne la maison la plus grande, et null si de la même taille */
	public static MaisonBean bigMaison(MaisonBean m1, MaisonBean m2) {
		if (m1 == null) {
			return m2;
		} else if (m2 == null) {
			return m1;
		} else if (m1.getLargeur() * m1.getLongeur() > m2.getLargeur() * m2.getLongeur()) {
			return m1;
		} else if (m1.getLargeur() * m1.getLongeur() < m2.getLargeur() * m2.getLongeur()) {
			return m2;
		} else {
			return null;
		}
	}

	// ------------------------------------------------------
	// travail tableau d'objet
	// -------------------------------------------------------

	/** Remplit le tableau de maison avec des largeurs et longueurs aléatoires */
	public static void createMaisons(MaisonBean[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new MaisonBean();
			tab[i].setLargeur(new Random().nextInt(20));
			tab[i].setLongeur(new Random().nextInt(30));
		}
	}

	/** Affiche les maisons avec leur taille. 1 maison par ligne */
	public static void printMaisons(MaisonBean[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(
					tab[i] + " fait " + tab[i].getLongeur() + " de long et " + tab[i].getLargeur() + " de large.");
		}
	}

	/** Retourne la maison la plus grande (Longueur * largeur) */
	public static MaisonBean bigMaisons(MaisonBean[] tab) {
		int resultat = 0;
		for (int i = 0; i < tab.length; i++) {
			if (i == tab.length - 1) {
				break;
			} else if ((tab[resultat].getLargeur() * tab[resultat].getLongeur()) < (tab[i + 1].getLargeur()
					* tab[i + 1].getLongeur())) {
				resultat = i;
			}
		}

		return tab[resultat];
	}

}