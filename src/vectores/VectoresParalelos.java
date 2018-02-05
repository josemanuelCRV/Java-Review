package vectores;

import java.util.Scanner;

/**
 * Adecuados cuando tenemos que asociar un dato respecto a otro
 */

public class VectoresParalelos {

	public static void main(String... misvectores) {

		// Llenar el vector

		String[] nombres = new String[3];
		int[] edades = new int[3];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese nombre: ");
			nombres[i] = input.next();
			System.out.println("Ingrese edad: ");
			edades[i] = input.nextInt();
		}
		input.close();

		System.out.println("-----------------------");

		// Recorre los vectores si se cumple la condición
		// for (int i = 0; i < 3; i++) {
		// if (edades[i] <= 33) {
		// System.out.println(nombres[i] + " --- " + edades[i]);
		// }
		// }

		/**
		 * Algoritmo por comparación. ([i] -->[1][2][n])
		 */

		// comenzamos en la posición cero y asumiendo que tiene el mayor valor
		int mayor = edades[0];
		int posicion = 0;

		for (int i = 0; i < 3; i++) {
			if (edades[i] > mayor) {
				mayor = edades[i];
				posicion = i;
			}

		}
		System.out.println("El mayor tiene: " + mayor);
		System.out.println("Y su nombre es: " + nombres[posicion]);

	}

}
