package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBasesSamples {


	public Connection getConnection() {
		Connection conexion = null;
		final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
		final String DDBB_URL = "jdbc:mariadb://localhost:3306/pruebas";
		final String USER = "root";
		final String PASS = "";
		try {
			Class.forName(JDBC_DRIVER);
			conexion = DriverManager.getConnection(DDBB_URL, USER, PASS);
		} catch (SQLException sqle) {
			sqle.getMessage();
		} catch (ClassNotFoundException nfe) {
			nfe.getMessage();
		}
		return conexion;
	}

	public String solicitarNombre() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, ingrese un nombre de persona:");
		String nombre = sc.nextLine();
		return nombre;
	}

	public int solicitarEdad() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, ingrese la edad:");
		int edad = sc.nextInt();
		return edad;
	}

	public void insertDB(String nombre, int edad) {
		final String INSERT_STATEMENT = "INSERT INTO personas_tb(nombre, edad) VALUES (?,?)";
		try {
			PreparedStatement st = getConnection().prepareStatement(INSERT_STATEMENT);
			st.setString(1, nombre);
			st.setInt(2, edad);
			st.executeUpdate();
			st.close();
			System.out.println("Sentencia de registro en la BBDD ejecutada");
		} catch (SQLException sqle) {
			sqle.getMessage();
		}
	}

	public List<Persona> listarPersonas() {
		List<Persona> listapersonas = null;
		final String SELECT_ALL_STATEMENT = "SELECT * FROM  personas_tb";
		try {
			PreparedStatement st = getConnection().prepareStatement(SELECT_ALL_STATEMENT);
			listapersonas = new ArrayList<>();
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Persona persona = new Persona();
				persona.setId(rs.getInt("id"));
				persona.setNombre(rs.getString("nombre"));
				persona.setEdad(rs.getInt("edad"));
				listapersonas.add(persona);
			}
			rs.close();
			st.close();
			System.out.println("Lista de Personas:");
		} catch (SQLException sqle) {
			sqle.getMessage();
		}
		
		return listapersonas;
	}

	
	
	
	
	private static void registrarPersonaDB() {
		DataBasesSamples dbsamples = new DataBasesSamples();
		String nombre = dbsamples.solicitarNombre();
		int edad = dbsamples.solicitarEdad();
		if (nombre != null) {
			if (edad != 0) {
				dbsamples.insertDB(nombre, edad);
			}
		} else {
			System.out.println("Es obligatorio ingresar valores de Nombre y Edad");
		}
	}

	private static void listarPersonasDB() {
		DataBasesSamples dbsamples = new DataBasesSamples();
		for (Persona per : dbsamples.listarPersonas()) {
			System.out.println(per.getId() + "-" + per.getNombre() + "-" + per.getEdad());
		}
	}

	public static void main(String[] args) throws SQLException {

		registrarPersonaDB();

		listarPersonasDB();

	}

}

/**
 * // JDBC Driver nombre y bbdd URL. //
 * jdbc:[mariadb,mysql,postgresql]://localhost:3306/database_name
 * 
 * // MYSQL // final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // final
 * String DDBB_URL = "jdbc:mysql/localhost:3306/pruebas";
 * 
 * // POSTGRESQL // final String JDBC_DRIVER = "org.postgresql.jdbc.Driver"; //
 * final String DDBB_URL = "jdbc:postgresql/localhost:5432/pruebas";
 * 
 * // MARIADB
 * 
 * 
 * final String JDBC_DRIVER = "org.mariadb.jdbc.Driver"; final String DDBB_URL =
 * "jdbc:mariadb://localhost:3306/pruebas";
 * 
 * // DDBB credenciales final String USER = "root"; final String PASS = "";
 * 
 * // Sentencias a la DDBB final String INSERT_STATEMENT = "INSERT INTO
 * personas_tb(nombre, edad) VALUES ('Jose',35)";
 * 
 * Connection conexion = null;
 * 
 * // refact: try with resources try(conexion = //
 * DriverManager.getConnection(DDBB_URL, USER, PASS)) try {
 * 
 * // * Class.forName(JDBC_DRIVER); conexion =
 * DriverManager.getConnection(DDBB_URL, // * USER, PASS); // * // * //
 * importamos la libreria del connector; mariadb|mysql| // * // * // java.sql
 * PreparedStatement st = // * conexion.prepareStatement(INSERT_STATEMENT);
 * st.executeUpdate(); st.close(); // * System.out.println("ejecutado y
 * finalizada la sentencia"); // * // * } catch (Exception e) {
 * e.printStackTrace(); // * // * } finally { // * // * if (conexion != null) {
 * if (!conexion.isClosed()) { conexion.close(); // *
 * System.out.println("Conexión cerrada"); } }
 * 
 * }
 * 
 */
