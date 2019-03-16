package jeudedes;

import java.awt.EventQueue;

public class Main {
	public static void main(final String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					IHM ihm = new IHM();
					ihm.frame.setVisible(true);

					Controler controler = new Controler();

					// Liaison
					controler.setIhm(ihm);
					ihm.setControler(controler);
					controler.refreshScreen();

					// ----------------------------------------
					// jeu de test (a retirer quand ca marche)
					// ----------------------------------------

					// controler.getPb().getJoueur2().setNom("philippe");
					// controler.getPb().getJoueur1().setNom("Aurelie");
					// controler.getPb().getJoueur1().setScorePartie(3);
					// controler.getPb().getJoueur2().setScorePartie(4);
					// controler.getPb().setNbreTour(8);
					// controler.getPb().getJc().getGobelet().getD1().setValeur(5);
					// controler.getPb().getJc().getGobelet().getD2().setValeur(3);
					// controler.getPb().getJoueur1().lancer();
					// controler.getPb().getJoueur2().lancer();
					// Initialisation
					// controler.refreshScreen();

				} catch (final Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}