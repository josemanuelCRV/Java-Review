package polimorfismo;

/**
 * Cambios, mutaci�n, distintas formas.
 * 
 * Ciertos m�todos o funciones van a comportarse de forma diferente, de acuerdo
 * al tipo de objeto o la instancia con los que se generen.
 * 
 * @see Animal
 *
 */
public class Main {

	public static void main(String... args) {

		// Para utilizar el polimorf�smo, y as� poder crear una insancia de
		// Lobo, necesito referenciar la clase Abstracta.

		Animal animalLobo = new Lobo("C�nido", 33, "Carn�voro", "Kavic");
		animalLobo.alimentarse(); // tendr� el comportamiento definido en Lobo

		Animal animalMacaco = new Macaco("Capuchino", 6, "herv�voro", "Tresly");
		animalMacaco.alimentarse();// comportamiento definido en Macaco
		animalMacaco.moverse(); // m�todo heredado gen�rico, igual para clases
								// hijas

	}

}
