package excepciones;

import java.util.Scanner;

public class Personalizadas {

	public static void main(String[] args) throws EdadExcepcion {

		System.out.println("Ingrese su edad");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		final int EDAD_MAXIMA = 100;

		// try {
		if (edad < EDAD_MAXIMA) {
			System.out.println(edad);
		} else {
			throw new EdadExcepcion("Edad no permitida");
			// sin bloque try-catch es disparada pero no manejada
		}
		// } catch (EdadExcepcion e) {
		// System.out.println("catch:" + e.getMessage());

		// }

	}

}
