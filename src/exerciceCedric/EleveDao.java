package exerciceCedric;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EleveDao {

	private final static String QUERY_SAVE_ELEVES = "INSERT INTO eleve (nom, note) VALUES (?, ?)";
	private final static String QUERY_SELECT_BY_NAME = "SELECT nom FROM eleve WHERE nom = ?";

	static Connection connection = null;

	public void setConnection(Connection connection) {
		EleveDao.connection = connection;
	}

	public void create(EleveBean eleve) throws SQLException {
		PreparedStatement stmt = null; // java.sql pour le choix

		try {
			stmt = connection.prepareStatement(QUERY_SAVE_ELEVES);
			// Remplir la requête
			stmt.setString(1, eleve.getNom());
			stmt.setInt(2, eleve.getNote());
			// Lancer la requête
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw e;
		}
	}

	public boolean readByName(String nom) throws SQLException {
		PreparedStatement stmt = null;
		boolean eleveExistant = false;
		ResultSet resultSet = null;
		try {
			stmt = connection.prepareStatement(QUERY_SELECT_BY_NAME);
			stmt.setString(1, nom);
			resultSet = stmt.executeQuery();
		} catch (SQLException e) {
			throw e;
		}
		if (resultSet.next()) {
			eleveExistant = true;
		}
		return eleveExistant;
	}

	public void createSafe(EleveBean eleve) throws SQLException {

		try {
			if (!readByName(eleve.getNom())) {
				create(eleve);
				System.out.println("l'eleve ajouter ");
			} else {
				System.out.println("l'eleve existe deja");
			}
		} catch (Exception e) {
			throw e;
		}
	}
}