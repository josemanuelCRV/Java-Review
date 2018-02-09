package patronDAO.interfaces;

import java.util.List;

import databases.Persona;

public interface IDaoPersona {

	
	public void registrarPersonaDB(Persona persona) throws Exception;
	public void editarPersonaDB(Persona persona) throws Exception;
	public void eliminarPersonaDB(Persona persona) throws Exception;
	public List<Persona> listarPersonasDB() throws Exception;
	
	
}
