package excepciones;

/**
 * Pasando la excepción de la capa 3 a la 1
 * 
 * 
 * @author josem
 *
 */
public class Trow_Trows {

	private void metodo1() {

		try {
			metodo2();
		} catch (Exception e) {
			System.out.println("catch-metodo1(): " + e.getMessage());
		}
	}

	private void metodo2() throws Exception {

		try {
			metodo3();
		} catch (Exception e) {
			// System.out.println("catch - metodo2(): " + e.getMessage());
			throw e;
		}
	}

	// La clausula throws viene acompañada de una definición de clase
	private void metodo3() throws Exception {

		try {
			int divion = 1 / 0;
		} catch (Exception e) {
			// System.out.println("Catch metodo3(): " + e.getMessage());
			// throw e;
			throw new Exception("metodo3(): enviando excepcion a capa superior" + e.getMessage());
			// trow viene acompañado de una instancia de clase, es
			// deicr, de un objeto.

			// arroja el error a la capa superior para que maneje el
			// error. metodo2();

		}
	}

	private void lanzarExcepcion() {
		throw new ArithmeticException();
		// throw requiere de una instancia de objeto (new)
		// o de un objeto ya instanciado (e).
		// Mientras que throws requiere de la especificación de una Clase
		// (throws Exception|NullPointerException|ArithmeticException|...)
	}

	public static void main(String[] args) {

		Trow_Trows objeto = new Trow_Trows();
		objeto.metodo1();
		// objeto.lanzarExcepcion();
	}

}
