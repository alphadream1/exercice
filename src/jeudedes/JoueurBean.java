package jeudedes;

public class JoueurBean {

	public static void main(String[] args) {
		JoueurBean joueur1 = new JoueurBean("philippe");
		joueur1.lancer();
		joueur1.ajouter1P();

		// --------------------
		// test
		// --------------------
		System.out.println(joueur1.getNom() + " a marque " + joueur1.getScorePartie() + " point(s).");
	}

	// ordre de declaration des methodes attribut / constructeur / methodes / getter

	// -------------------------
	// attribut
	// -------------------------

	private String nom;
	private int scorePartie;
	private GobeletBean gobelet;
	private boolean tricheur;

	// ----------------------
	// Constructor
	// ----------------------

	public JoueurBean(String nom) {
		super();
		this.nom = nom;
		scorePartie = 0;
		gobelet = new GobeletBean();
	}

	// -----------------------
	// Methodes
	// -------------------------
	public void lancer() {
		gobelet.lancer();
	}

	public void ajouter1P() {
		scorePartie++;
	}

	public void setTricheur(boolean tricheur) {
		this.tricheur = tricheur;
		gobelet = new GobeletBean(tricheur);
	}

	// -------------------------
	// getter / setter
	// -------------------------
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getScorePartie() {
		return scorePartie;
	}

	public void setScorePartie(int scorePartie) {
		this.scorePartie = scorePartie;
	}

	public GobeletBean getGobelet() {
		return gobelet;
	}

	public void setGobelet(GobeletBean gobelet) {
		this.gobelet = gobelet;
	}

	public boolean isTricheur() {
		return tricheur;
	}

}
