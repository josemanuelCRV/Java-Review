package excepciones;

public class EdadExcepcion extends Exception {

	/**
	 * Excepción personalizada.
	 */
	private static final long serialVersionUID = 1L;

	public EdadExcepcion(String mensaje) {
		super(mensaje);
		// pasamos el mensaje al constructor de la clase de la que está
		// heredando.
	}

}
