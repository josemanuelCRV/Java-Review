package interfaces;

/**
 * 
 * Una Interfaz es una colección de métodos abstractos y propiedades. En ella se
 * indica qué se debe hacer pero no su implementación.
 * 
 * 
 * 
 * Diferencia de Interfaz y clase Abstrac, ¿Cuándo utilizar cada una? Una clase
 * abstracta obliga a usar la herencia y hacer uso de una clase en particular.
 * Siempre dependería de ella y solo podría utilizar las cosas que estén
 * definidas en esa clase.
 * 
 * El uso de Interfaces me permite implemtentar diferentes tipos de interfaces a
 * la vez y así modularizar mejor los programas. Simula la No existente herencia
 * múltiple en Java.
 * 
 * @author josem
 *
 */
public interface IAnimal {

	// Definición de métodos - A implementar por clase hija.
	public void mostrarTipoAnimal();

	public String mostrarNombre();

}
