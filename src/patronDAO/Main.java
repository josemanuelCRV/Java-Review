package patronDAO;

import databases.Persona;
import patronDAO.dao.DaoPersonaImpl;
import patronDAO.interfaces.IDaoPersona;

/**
 * Separar la lógica de la aplicación de la lógica de acceso a bbdd.
 * 
 * @author josem
 *
 */

public class Main {

	public static void main(String[] args) throws Exception {

		Persona persona = new Persona();
		persona.setId(9);
		persona.setNombre("Santiago");
		persona.setEdad(38);

//		try {
//			IDaoPersona dao = new DaoPersonaImpl();
//			dao.registrarPersonaDB(persona);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			IDaoPersona dao = new DaoPersonaImpl();
//			dao.editarPersonaDB(persona);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			IDaoPersona dao = new DaoPersonaImpl();
//			dao.eliminarPersonaDB(persona);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		try {
			IDaoPersona dao = new DaoPersonaImpl();
			for (Persona p : dao.listarPersonasDB()) {
				System.out.println(p.getId() + "-" + p.getNombre() + "-" + p.getEdad());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
