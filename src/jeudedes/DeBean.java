package jeudedes;

import java.util.Random;

public class DeBean {

	// -------------------------
	// attribut
	// -------------------------

	protected int valeur;
	protected static Random random = new Random();

	// ----------------------------
	// constructor
	// ----------------------------

	public DeBean() {
		this(1);
	}

	public DeBean(int valeur) {
		valeur = random.nextInt(6) + 1;
	}

	// --------------------
	// Methodes
	// ------------------------

	public void lancer() {
		valeur = new Random().nextInt(6) + 1;
	}

	public void print() {
		System.out.println("De : " + valeur);
	}

	@Override
	public String toString() {
		return "De : " + valeur;
	}

	// --------------------
	// Getter/ Setter
	// ------------------------

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

}