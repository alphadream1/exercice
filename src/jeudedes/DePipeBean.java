package jeudedes;

public class DePipeBean extends DeBean {

//	public static void main(String[] args) {
//		int compteur1 = 0;
//		int compteur2 = 0;
//		Random value = new Random();
//		for (int i = 0; i < 100000; i++) {
//			if (value.nextInt(2) % 2 == 0) {
//				compteur1++;
//			} else {
//				compteur2++;
//			}
//		}
//		System.out.println(compteur1 + " ce qui represente " + ((double) compteur1 / 1000) + " %");
//		System.err.println(compteur2 + " ce qui represente " + ((double) compteur2 / 1000) + " %");
//	}

	private int valeur;

	// -----------------
	// methode
	// -----------------

	@Override
	public void lancer() {
		if (random.nextBoolean()) {
			super.lancer();
		} else {
			valeur = 6;
		}

	}

	// -----------------------
	// getter an setter
	// -------------------

	@Override
	public int getValeur() {
		return valeur;
	}

	@Override
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
}
