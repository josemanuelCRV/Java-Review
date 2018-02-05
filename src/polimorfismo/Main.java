package polimorfismo;

/**
 * Cambios, mutación, distintas formas.
 * 
 * Ciertos métodos o funciones van a comportarse de forma diferente, de acuerdo
 * al tipo de objeto o la instancia con los que se generen.
 * 
 * @see Animal
 *
 */
public class Main {

	public static void main(String... args) {

		// Para utilizar el polimorfísmo, y así poder crear una insancia de
		// Lobo, necesito referenciar la clase Abstracta.

		Animal animalLobo = new Lobo("Cánido", 33, "Carnívoro", "Kavic");
		animalLobo.alimentarse(); // tendrá el comportamiento definido en Lobo

		Animal animalMacaco = new Macaco("Capuchino", 6, "hervívoro", "Tresly");
		animalMacaco.alimentarse();// comportamiento definido en Macaco
		animalMacaco.moverse(); // método heredado genérico, igual para clases
								// hijas

	}

}
