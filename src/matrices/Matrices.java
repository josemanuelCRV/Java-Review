package matrices;

import java.util.Scanner;

public class Matrices {

	/**
	 * Arrays multidimensionales que nos permiten almacenar mucha más
	 * información.
	 * 
	 * Planteamos un cuadrado de filas/columnas
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] numeros = new int[3][3]; // 3 filas - 3 columnas

		// Llenado de la matriz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Ingrese elemento en la posición de\nFila: " + i + " Columna: " + j);
				numeros[i][j] = sc.nextInt();
			}
		}
		sc.close();

		// imprimir matriz tabulada \t
		// for (int i = 0; i < 3; i++) {
		// for (int j = 0; j < 3; j++) {
		// System.out.print(" " + numeros[i][j] + "\t");
		//
		// }
		// System.out.println("");
		// }

		
		// imprimir diagonal de la matriz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) { // i==j diagonal, fila(i), columna(j)
					System.out.print(numeros[i][j]);
				} else { // rellena con 0
					System.out.print(0);
				}
			}
			System.out.println("");
		}

	}

}
