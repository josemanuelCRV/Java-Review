package vectores;

import java.util.Scanner;

/**
 * Algoritmo de ordenamiento: Burbuja - Buble Short Fuerza bruta lógica o
 * intercambio directo.
 * 
 * // Consiste en revisar y comparar cada elemento de la lista que va a ser //
 * ordenada con el siguiente elemento.
 * 
 * @author josem
 *
 */
public class Burbuja {

	public static void main(String[] args) {

		// Llenar el vector

		String[] nombres = new String[3];
		int[] edades = new int[3];
		Scanner input = new Scanner(System.in);
		String auxs;

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese nombre: ");
			nombres[i] = input.next();
			System.out.println("Ingrese edad: ");
			edades[i] = input.nextInt();
		}
		input.close();

		System.out.println("-----------------------");

		// Algoritmo burbuja ordena las edades
		// for (int i = 0; i < 2; i++) {
		// for (int j = 0; j < 2 - i; j++) {
		// // ¿j mayor que su siguiente posición?
		// if (edades[j] > edades[j + 1]) {
		// aux = edades[j]; // True, aux guarda el mayor valor
		// edades[j] = edades[j + 1]; // j+1 es menor, pasa a pos j
		// edades[j + 1] = aux; // j+1 ahora tiene el mayor valor
		//
		// }

		// Algoritmo burbuja ordena los nombres
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2 - i; j++) {
				// ¿j mayor que su siguiente posición?
				if (nombres[j].compareTo(nombres[j + 1]) > 0) { 
					auxs = nombres[j]; // True, aux guarda el mayor valor
					nombres[j] = nombres[j + 1]; // j+1 es menor, pasa a pos j
					nombres[j + 1] = auxs; // j+1 ahora tiene el mayor valor

				}

			}
		}

		// Pintamos cómo queda ordenada la lista de menor a mayor.
		for (String element : nombres) {
			System.out.println(element + "  ");
		}

		
		
		
		/*
		 * Explicado
		 */
		// System.out.println("Necesitamos ordenar de mayor a menor la siguiente
		// lista de edades:\n");
		// for (int element : edades) {
		// System.out.println(element + " ");
		// }
		// System.out.println("");
		//
		// // Algoritmo de ordenanición burbuja
		// for (int i = 0; i < 2; i++) {
		// System.out.println("Ronda: " + i + "\nSituación Lista");
		// for (int element : edades) {
		// System.out.print(element + " ");
		// }
		// System.out.println("");
		// for (int j = 0; j < 2 - i; j++) {
		// // ¿j mayor que su siguiente posición?
		// System.out.println("¿Es mayor " + edades[j] + " que " + edades[j + 1]
		// + "?");
		//
		// if (edades[j] > edades[j + 1]) {
		// aux = edades[j]; // True, aux guarda el mayor valor
		// System.out.println("Si! " + edades[j] + " avanza pos. y " + edades[j
		// + 1] + " retrocede pos.");
		// edades[j] = edades[j + 1]; // j+1 es menor, pasa a pos j
		// edades[j + 1] = aux; // j+1 ahora tiene el mayor valor
		// } else {
		// System.out.println("No. Pasamos a calcular el siguiente par de
		// posiciones");
		// }
		// }
		// }
		// // Pintamos cómo queda ordenada la lista de menor a mayor.
		// for (int element : edades) {
		// System.out.println(element + " ");
		// }
		//

	}
}
