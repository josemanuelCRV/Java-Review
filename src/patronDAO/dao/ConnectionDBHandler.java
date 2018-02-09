package patronDAO.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDBHandler {

	protected Connection conexion = null;
	private final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	private final String DDBB_URL = "jdbc:mariadb://localhost:3306/pruebas";
	private final String USER = "root";
	private final String PASS = "";

	public void conectar() {
		try {
			Class.forName(JDBC_DRIVER);
			conexion = DriverManager.getConnection(DDBB_URL, USER, PASS);
		} catch (SQLException sqle) {
			sqle.getMessage();
		} catch (ClassNotFoundException nfe) {
			nfe.getMessage();
		}
	}
	
	public void cerrarConex() throws SQLException{
		if(conexion != null){
			if(!conexion.isClosed()){
				conexion.close();
			}
		}
		
	}
	
	

}
