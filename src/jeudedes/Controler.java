package jeudedes;

public class Controler {

	// Donn�e
	private PartieBean pb;
	// IHM
	private IHM ihm;

	// --------------------
	// Constructeur
	// ------------------------
	public Controler() {
		super();
		pb = new PartieBean("Ezio", "Milan");
	}

	// --------------------
	// M�thode
	// ------------------------

	/**
	 * A partir des donn�es (partieBean) met � jour l'IHM
	 */
	public void refreshScreen() {
		ihm.majJ1(pb.getJoueur1().getNom(), "" + pb.getJoueur1().getScorePartie(), pb.getJoueur1().isTricheur());
		ihm.majJ2(pb.getJoueur2().getNom(), "" + pb.getJoueur2().getScorePartie(), pb.getJoueur2().isTricheur());
		ihm.majTour("" + pb.getNbreTour());

		boolean vBtLancerJ1 = false, vBtLancerJ2 = false, vBtRestart = false;
		String messsage = "";
		// partie termin�e
		if (getPb().getNbreTour() == Constantes.NBR_TOUR) {
			ihm.majDe("0", "0");
			vBtRestart = true;
			if (pb.getJoueur1().getScorePartie() > pb.getJoueur2().getScorePartie()) {
				messsage = "le gagnant est : " + pb.getJoueur1().getNom();
			} else if (pb.getJoueur1().getScorePartie() < pb.getJoueur2().getScorePartie()) {
				messsage = "le gagnant est : " + pb.getJoueur2().getNom();
			} else if (pb.getJoueur1().getScorePartie() == pb.getJoueur2().getScorePartie()) {
				messsage = "Egalit�";
			}
		} else if (getPb().getJc() == getPb().getJoueur1()) {
			vBtLancerJ1 = true;
			ihm.majDe("" + pb.getJoueur2().getGobelet().getD1().getValeur(),
					"" + pb.getJoueur2().getGobelet().getD2().getValeur());
		} else if (getPb().getJc() == getPb().getJoueur2()) {
			vBtLancerJ2 = true;
			ihm.majDe("" + pb.getJoueur1().getGobelet().getD1().getValeur(),
					"" + pb.getJoueur1().getGobelet().getD2().getValeur());
		}

		ihm.updateMessage(messsage);
		ihm.updateVisibilityButtons(vBtLancerJ1, vBtLancerJ2, vBtRestart);
	}

	public void clicLancerJ1() {
		pb.getJoueur1().lancer();
		if (pb.getJoueur1().getGobelet().getScoreDes() >= Constantes.SCORE_A_ATTEINDRE) {
			// ---- > 7 on incremente son score partie
			pb.getJoueur1().ajouter1P();
		}
		pb.changerJC();
		refreshScreen();
	}

	public void clicLancerJ2() {
		pb.getJoueur2().lancer();
		if (pb.getJoueur2().getGobelet().getScoreDes() >= Constantes.SCORE_A_ATTEINDRE) {
			// ---- > 7 on incremente son score partie
			pb.getJoueur2().ajouter1P();
		}
		pb.changerJC();
		pb.ajouterUnTour();
		refreshScreen();
	}

	public void clicRestart() {
		pb = new PartieBean("Ezio", "Milan");
		refreshScreen();
	}

	public void checkChangeJ1(boolean check) {
		getPb().getJoueur1().setTricheur(check);
	}

	public void checkChangeJ2(boolean check) {
		getPb().getJoueur2().setTricheur(check);
	}

	public void lancer() {

		// FOR 10 fois
		for (; pb.getNbreTour() < Constantes.NBR_TOUR; pb.ajouterUnTour()) {
			// ---- 1 Tour
			// ---- J1 lance
			pb.getJoueur1().lancer();
			// ---- on regarde le score
			if (pb.getJoueur1().getGobelet().getScoreDes() >= Constantes.SCORE_A_ATTEINDRE) {
				// ---- > 7 on incremente son score partie
				pb.getJoueur1().ajouter1P();
			}

			// ---- Idem J2
			pb.getJoueur2().lancer();
			if (pb.getJoueur2().getGobelet().getScoreDes() >= Constantes.SCORE_A_ATTEINDRE)

			{
				pb.getJoueur2().ajouter1P();
			}
			// ---- Changer le joueur courant
			// ---- Incrementer le nbTour
		}

	}

	public void lancerV2() {

		// FOR 10 fois
		for (; pb.getNbreTour() < Constantes.NBR_TOUR;) {
			pb.getJc().lancer();
			// ---- on regarde le score
			if (pb.getJc().getGobelet().getScoreDes() >= Constantes.SCORE_A_ATTEINDRE) {
				// ---- > 7 on incremente son score partie
				pb.getJc().ajouter1P();
			}
			pb.changerJC();
			if (pb.getJc() == pb.getJoueur1()) {
				pb.ajouterUnTour();
			}
		}
	}

	public void afficherResultat() {
//Je compare les scores de J1 et J2
		// J'affiche le gagnant et le score
		if (pb.getJoueur1().getScorePartie() > pb.getJoueur2().getScorePartie()) {
			System.out.print(pb.getJoueur1().getNom() + " a gagn� : ");
		} else if (pb.getJoueur1().getScorePartie() < pb.getJoueur2().getScorePartie()) {
			System.out.print(pb.getJoueur2().getNom() + " a gagn� : ");
		} else {
			System.out.print("Egalit� : ");
		}
		System.out.println(pb.getJoueur1().getScorePartie() + " - " + pb.getJoueur2().getScorePartie());
	}

	// --------------------
	// GETTER / SETTER
	// ------------------------
	public void setIhm(IHM ihm) {
		this.ihm = ihm;
	}

	public PartieBean getPb() {
		return pb;
	}
}