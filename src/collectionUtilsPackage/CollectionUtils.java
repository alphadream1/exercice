package collectionUtilsPackage;

import java.util.ArrayList;
import java.util.Random;

import packageObjet.EleveBean;

public class CollectionUtils {

	public static void main(String[] args) {

		// creation d'une liste
		ArrayList<EleveBean> eleveArrayList1 = new ArrayList<>();

		// -------------------
		// appel des methodes
		// -------------------
		fillList(eleveArrayList1, 25);
		printList(eleveArrayList1);
		getMax(eleveArrayList1);
		supInfMoyenne(eleveArrayList1);
		printList(eleveArrayList1);

		// test savoir la taille de ma liste
		// System.err.println(eleveArrayList1.size());
	}

	/** Remplis la liste d’eleve leur donnant des noms et note aléatoire */
	public static void fillList(ArrayList<EleveBean> eleveArrayList, int nbEleve) {
		Random noteRandom = new Random();
		for (int i = 0; i < nbEleve; i++) {
			EleveBean eleve = new EleveBean();
			eleve.setNom(getRandomName());
			eleve.setNote(noteRandom.nextInt(21));
			eleveArrayList.add(eleve);
		}
	}

	/** Affiche laliste dans la console */
	public static void printList(ArrayList<EleveBean> eleveArrayList) {
		for (EleveBean elevebean : eleveArrayList) {
			System.out.println(elevebean.getNom() + " : " + elevebean.getNote());
		}
	}

	/** Affiche et retourne le 1erélève avec la meilleur note */
	public static EleveBean getMax(ArrayList<EleveBean> eleveArrayList) {
		EleveBean eleveNoteMax = null;
		for (int i = 0; i < eleveArrayList.size(); i++) {
			if (eleveNoteMax == null) {
				eleveNoteMax = eleveArrayList.get(i);
			}
			if (eleveArrayList.get(i).getNote() > eleveNoteMax.getNote()) {
				eleveNoteMax = eleveArrayList.get(i);
			}
		}
		System.out.println("le 1er eleve avec la meilleur note est " + eleveNoteMax.getNom());
		return eleveNoteMax;
	}

	/** Retire les éléves n’ayant pas la moyenne de la classe */
	public static void supInfMoyenne(ArrayList<EleveBean> eleveArrayList) {
		int moyenneClasse = 0;
		for (EleveBean eleveBean : eleveArrayList) {
			moyenneClasse += eleveBean.getNote();
		}
		moyenneClasse /= eleveArrayList.size();
		for (int i = eleveArrayList.size() - 1; i >= 0; i--) {
			if (eleveArrayList.get(i).getNote() < moyenneClasse) {
				eleveArrayList.remove(i);
			}
		}
	}

	/** Retourne un prénom aléatoire */
	public static String getRandomName() {
		String[] name = new String[] { "Toto", "Tata", "Titi", "Bob", "Alfred" };
		return name[new Random().nextInt(name.length)];
	}
}
