package patronDAO.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import databases.Persona;
import patronDAO.interfaces.IDaoPersona;

/**
 * Clase que implementa los métodos definidos en la interfaz, que nos permitirán
 * realizar las operaciones correspondientes para Persona con la BBDD.
 * 
 * @author josem
 *
 */
public class DaoPersonaImpl extends ConnectionDBHandler implements IDaoPersona {

	@Override
	public void registrarPersonaDB(Persona persona) throws Exception {
		final String INSERT_STATEMENT = "INSERT INTO personas_tb(nombre, edad) VALUES (?,?)";
		try {
			this.conectar();
			PreparedStatement st = this.conexion.prepareStatement(INSERT_STATEMENT);
			st.setString(1, persona.getNombre());
			st.setInt(2, persona.getEdad());
			st.executeUpdate();
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
	}

	@Override
	public void editarPersonaDB(Persona persona) throws Exception {
		final String UPDATE_STATEMENT = "UPDATE personas_tb SET nombre=? WHERE id=?";
		try {
			this.conectar();
			PreparedStatement st = this.conexion.prepareStatement(UPDATE_STATEMENT);
			st.setString(1, persona.getNombre());
			st.setInt(2, persona.getId());
			st.executeUpdate();
		} catch (Exception e) {
			 e.printStackTrace();
		}
	}

	@Override
	public void eliminarPersonaDB(Persona persona) throws Exception {
		final String DELETE_STATEMENT = "DELETE FROM personas_tb WHERE id=?";
		try {
			this.conectar();
			PreparedStatement st = this.conexion.prepareStatement(DELETE_STATEMENT);
			st.setInt(1, persona.getId());
			st.executeUpdate();
		} catch (Exception e) {
			 e.printStackTrace();
		}
	}

	@Override
	public List<Persona> listarPersonasDB() throws Exception {
		List<Persona> listapersonas = null;
		final String SELECT_STATEMENT = "SELECT * FROM  personas_tb";
		try {
			this.conectar();
			PreparedStatement st = this.conexion.prepareStatement(SELECT_STATEMENT);
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
			
		} catch (Exception e) {
			 e.printStackTrace();
		}
		return listapersonas;
	}

}
