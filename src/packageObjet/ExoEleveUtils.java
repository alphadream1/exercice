package packageObjet;

import java.util.Random;

public class ExoEleveUtils {

	public static void main(String[] args) {

		// travail objet
		EleveBean e = new EleveBean();
		e.setNom("Bob");
		e.setNote(15);

		EleveBean e2 = new EleveBean();
		e2.setNom("Max");
		e2.setNote(15);

		printEleve(e);
		doubleNote(e);
		printEleve(e);
		printEleve(e2);
		// System.out.println("le meilleur eleve est : " + (meilleurEleve(e,
		// e2).getNom()));

		// -------------------------------------------------------
		// travail tableau d'objet

		EleveBean[] eleveTab = new EleveBean[5];

		createEleves(eleveTab);
		printEleves(eleveTab);

		printEleve(bestBob(eleveTab));
	}

	// travail objet

	public static void printEleve(EleveBean e) {
		if (e == null) {
			System.out.println("il n'y a pas d'eleve.");
		} else {
			System.out.println("l'élève s'appel " + e.getNom() + " et a obtenu une note de " + e.getNote() + ".");
		}
	}

	/** Double la taille de la maison */
	public static void doubleNote(EleveBean e) {
		if (e == null) {
			System.out.println("il n'y a pas d'eleve.");
		} else {
			e.setNote(e.getNote() * 2);
			System.out.println("la note doublée est : " + (e.getNote() * 2) + ".");
		}
	}

	/** Retourne la maison la plus grande, et null si de la même taille */
//	public static EleveBean meilleurEleve(EleveBean e1, EleveBean e2) {
//		if (e1.getNote() == null) {
//			return e2;
//		} else if (e2.getNote() == null) {
//			return e1;
//		} else if (e1.getNote() > e2.getNote()) {
//			return e1;
//		} else if (e1.getNote() < e2.getNote()) {
//			return e2;
//		} else {
//			return null;
//		}
//
//	}

	// --------------------------------------------------
	// travail tableau d'objet

	/** Remplit le tableau d’élève avec des noms et une note aléatoire */
	public static void createEleves(EleveBean[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new EleveBean();
			tab[i].setNom(getRandomName());
			tab[i].setNote(new Random().nextInt(21));
		}
	}

	/** Affiche les élèves avec leur note */
	public static void printEleves(EleveBean[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println("L'eleve " + (i + 1) + " s'appel : " + tab[i].getNom() + " et il a eu une note de : "
					+ tab[i].getNote() + ".");
		}

//		avec foreach
//		for (EleveBean e : tab) {
//			printEleve(e);
//	}

	}

	/** Retourne l’élève s’appelant bob ayant la meilleurs note */
	public static EleveBean bestBob(EleveBean[] tab) {

// ma premiere solution
//		int indexBest = 0;
//		int indexStock = -1;
//		for (int i = 0; i < tab.length; i++) {
//			if (tab[i].nom == "Bob" && indexStock != -1) {
//				if (tab[i].note > tab[indexStock].note) {
//					indexBest = i;
//					indexStock = i;
//				}
//			} else if (tab[i].nom == "Bob") {
//				indexStock = i;
//			}
//		}
//		return tab[indexBest];

// ma deuxieme solution
		EleveBean bestBob = null;

		for (int i = 0; i < tab.length; i++) {
			if ("Bob".equals(tab[i].getNom())) {
				if (bestBob == null || bestBob.getNote() < tab[i].getNote()) {
					bestBob = tab[i];
				}
			}
		}

		return bestBob;

	}

	/** Retourne un prénom aléatoire */
	public static String getRandomName() {
		String[] name = new String[] { "Toto", "Tata", "Titi", "Bob", "Alfred" };
		return name[new Random().nextInt(name.length)];
	}

}
