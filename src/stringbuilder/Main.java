package stringbuilder;

/**
 * 
 * Eficiencia para concatenar con Operador '+' vs StringBuilder.
 * 
 * Las cadenas String por naturaleza son inmutables, una vez creadas no se
 * pueden modificar.
 * 
 * Al utilizar el operador '+' para concatenar cadenas, por debajo el operador
 * utiliza la instancia de StringBuilder. De esa forma, crea 1 objeto al que
 * añadir la nueva cadena de texto para podersela asignar a la cadena original.
 * Esto lo realiza por cada iteración. En este ejemplo crea hasta 1000 objetos a
 * los que poder asignar la nueva referencia de memoria a la referencia inicial.
 * Costoso e ineficiente.
 *
 */
public class Main {

	public static void main(String... args) {

		// Tiempo concatenar con StringBuilder x1000
		long tiempo_inicio1 = System.nanoTime();
		StringBuilder sbuilder = new StringBuilder();

		for (int i = 0; i < 1000; i++) {
			sbuilder.append(i); // único objeto StringBuilder
		}

		long tiempo_fin1 = System.nanoTime();
		double diferencia_1 = tiempo_fin1 - tiempo_inicio1;
		System.out.println("StringBuilder: " + diferencia_1);

		// *********************************************

		// Tiempo concatenar con el operador "+" x1000
		long tiempo_inicio_2 = System.nanoTime();
		String texto = "";

		for (int i = 0; i < 1000; i++) {
			texto += i; // operador + crea instancia StringBuilder
		}

		long tiempo_fin_2 = System.nanoTime();
		double diferencia_2 = tiempo_fin_2 - tiempo_inicio_2;
		System.out.println("Operador '+' : " + diferencia_2);

	}

}
