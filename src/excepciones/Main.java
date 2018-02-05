package excepciones;

public class Main {

	// método para producir Error
	public void proceso1() {
		int a = 5, b = 0;
		int division = a / b;
		System.out.println(division);
	}

	public static void main(String[] args) {

		/////////////////////
		// Bloque completo de captura y manejo.

		try {
			Main objeto = new Main();
			objeto.proceso1();
			
		} catch (Exception ex) {
			System.out.println("Error proceso1() method: " + ex.getMessage());
		}

		finally {
			// se ejecuta si o si.
			System.out.println("bloque  finally");
		}

		/////////////////////

		// Si solamente utilizamos utilizamos try, y no el bloque catch, debemos
		// incluir finally

		try {
			// ejecuta este proceso
		} finally {
			// y si o si ejecuta finally
		}

		/////////////////////

		// La otra combinación sería:

		try {

		} catch (Exception ex) {

		}

	}

}
