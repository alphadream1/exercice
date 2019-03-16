package jeudedes;

public class GobeletBean {

//	public static void main(String[] args) {
//		GobeletBean Gobelet = new GobeletBean(joueurTricheur);
//		Gobelet.lancer();
//		Gobelet.getScoreDes();
//
//		// test de fonctionnement
//		System.out.println(Gobelet.getScoreDes());
//	}

	// ordre de declaration des methodes attribut / constructeur / methodes / getter

	// -------------------------
	// attribut
	// -------------------------

	private DeBean d1;
	private DeBean d2;

	// ----------------------
	// Constructor
	// ----------------------

	public GobeletBean() {
		this(false);
	}

	public GobeletBean(boolean truque) {
		if (truque) {
			d2 = new DePipeBean();
		} else {
			d2 = new DeBean();
		}
		d1 = new DeBean();
	}

	// -----------------------
	// Methodes
	// -------------------------

	public void lancer() {
		d1.lancer();
		d2.lancer();
	}

	public int getScoreDes() {
		return d1.getValeur() + d2.getValeur();
	}

	// -------------------------
	// getter / setter
	// --------------------------

	public DeBean getD1() {
		return d1;
	}

	public void setD1(DeBean d1) {
		this.d1 = d1;
	}

	public DeBean getD2() {
		return d2;
	}

	public void setD2(DeBean d2) {
		this.d2 = d2;
	}

}