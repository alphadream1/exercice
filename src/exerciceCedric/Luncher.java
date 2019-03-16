package exerciceCedric;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Luncher {
	public static void main(String[] args) {

		testConnectionValidity();

		// Insertion d'un eleve
		// EleveBean eleve1 = new EleveBean("yyedeezfty-rur", 5);
		// EleveDao eleveDao = new EleveDao();
		EleveService eleveService = new EleveService();
		ArrayList<EleveBean> eleveList = new ArrayList<>();
		EleveBean eleve = new EleveBean(12, "Auré");
		eleveList.add(eleve);
		eleve = new EleveBean(16, "Sandra");
		eleveList.add(eleve);
		eleve = new EleveBean(19, "phil");
		eleveList.add(eleve);
		try {
			// eleveDao.setConnection(connection);
			eleveService.registerEleveGroup(eleveList);
			// eleveService.registerEleveGroup(eleveList);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Echec de l'insertion de l'eleve");
		}

	}

	private static void testConnectionValidity() {
		// Obtenir une connexion
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = null;
		try {
			connection = connectionFactory.getConnection();
			System.out.println("Connexion valide => " + connection.isValid(10));
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Echec de la creation de la connexion");
			System.exit(-1);
		}
	}

}
