package excepciones;

/**
 *						Throwable
 *							|
 *  Error ------------------|-----------Exception
 *    |										|
 * AssertionErro  							|
 *					RuntimeException--------|----------------IOException
 * 							|
 * 	AritmeticException------|------NullPointerException
 * 
 * 
 * 
 * 
 * 
 *
 */
public class Jerarquia {

	// m�todo para producir Error
	public void proceso1() {
		int a = 5, b = 0;
		int division = a / b;
		System.out.println(division);
	}

	public static void main(String... args) {

		// El orden de Exception en los bloques catch van de menor a mayor.

		// No podemos definir una excepci�n de jerarqu�a mayor por delante de
		// otra menor. Ya que dar� un fallo del compilador indicando que la
		// excepci�n menor ya est� contemplada en la de arriba.

		// El ejemplo ser�a que definiesemos en el siguiente bloque la Exception
		// en el primer catch, ya que NullPointer y Arithmetic ya est�n
		// contempladas.

		// El error NullPointerException se genera cuando no instanciamos a un
		// objeto. (Main objeto = null; // No se define la instancia 'new Main()', por lo que no
		// existe un espacio de memoria reservado, ser� nulo.

		try {
			//Main objeto = null;
			Main objeto = new Main();
			objeto.proceso1();
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException: " + ex.getMessage());
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("General Exception: " + ex.getMessage());
		} finally {
			// se ejecuta si o si.
			System.out.println("bloque  finally");
		}

	}

}
