
package exoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import collectionUtilsPackage.CollectionUtils;
import packageObjet.EleveBean;

public class EleveDaoUtils {

	public static void main(String[] args) {
		EleveBean eleveBean = new EleveBean(14, "bob");
		eleveBean = new EleveBean(2, "toto");
		try {
			insertEleve(eleveBean);
			System.out.println("Elève ajouté");
			ArrayList<EleveBean> list = requetSelect();
			CollectionUtils.printList(list);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private final static String QUERY_SAVE_ELEVES = "INSERT INTO Eleve (nom, note) VALUES (?, ?);";

	public static void insertEleve(packageObjet.EleveBean eleve) throws Exception {
		Connection con = null; // java.sql pour le choix
		PreparedStatement stmt = null; // java.sql pour le choix
		try {
			// Pour travailler avec Tomcat
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection(ConnexionJDBC.URL, ConnexionJDBC.LOGIN, ConnexionJDBC.PASSWORD); // La
																												// connexion
			stmt = con.prepareStatement(QUERY_SAVE_ELEVES);
			// Remplir la requête
			stmt.setString(1, eleve.getNom());
			stmt.setInt(2, eleve.getNote());
			// Lancer la requête
			stmt.executeUpdate();
		} finally {
			// On ferme la connexion
			if (con != null) {
				try {
					con.close();
				} catch (final SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private final static String QUERY_FIND_ELEVES = "SELECT * FROM Eleve ;";

	public static ArrayList<EleveBean> requetSelect() throws Exception {
		Connection con = null;
		Statement stmt = null;
		ArrayList<EleveBean> list = new ArrayList<>();
		try {
			// Pour travailler avec Tomcat et wamp Rajouter :
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection(ConnexionJDBC.URL, ConnexionJDBC.LOGIN, ConnexionJDBC.PASSWORD); // La
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery(QUERY_FIND_ELEVES);
			while (rset.next()) {
				EleveBean eleve = rsetToEleve(rset);
				list.add(eleve);
			}

			return list;
		} finally {
			if (con != null) {// On ferme la connexion
				try {
					con.close();
				} catch (final SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static EleveBean rsetToEleve(ResultSet rset) throws SQLException {
		final EleveBean eleve = new EleveBean();

		eleve.setId(rset.getInt("id"));
		eleve.setNom(rset.getString("nom"));
		eleve.setNote(rset.getInt("note"));

		return eleve;
	}

}