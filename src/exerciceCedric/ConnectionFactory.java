package exerciceCedric;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static final String URL = "jdbc:mysql://localhost:3306/exojdbc";
	public static final String LOGIN = "root";
	public static final String PASSWORD = "";

	public Connection getConnection() throws SQLException {

		Connection con = null;

		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
		} catch (final SQLException e) {
			e.printStackTrace();
			throw e;
		}

		return con;
	}
}
