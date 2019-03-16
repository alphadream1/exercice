package exerciceCedric;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EleveService {

	Connection connection = null;
	EleveDao eleveDao = null;

	public EleveService() {
		super();
		eleveDao = new EleveDao();
	}

	public void registerEleveGroup(List<EleveBean> eleveList) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connection = connectionFactory.getConnection();
		// Fournir la connexion a notre DAO
		connection.setAutoCommit(false);
		eleveDao.setConnection(connection);
		boolean okInsert = true;
		try {
			for (EleveBean eleve : eleveList) {

				boolean alreadyExistingEleve = eleveDao.readByName(eleve.getNom());
				if (!alreadyExistingEleve) {
					eleveDao.create(eleve);
				} else {
					okInsert = false;
					System.out.println("Un ou plusieurs de ces élèves existe(nt) déjà ");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			okInsert = false;
			throw e;
		}
		if (okInsert) {
			connection.commit();
		} else {
			connection.rollback();
		}
	}
}
