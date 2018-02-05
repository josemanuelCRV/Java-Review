package interfaces;

/**
 * 
 * Una Interfaz es una colecci�n de m�todos abstractos y propiedades. En ella se
 * indica qu� se debe hacer pero no su implementaci�n.
 * 
 * 
 * 
 * Diferencia de Interfaz y clase Abstrac, �Cu�ndo utilizar cada una? Una clase
 * abstracta obliga a usar la herencia y hacer uso de una clase en particular.
 * Siempre depender�a de ella y solo podr�a utilizar las cosas que est�n
 * definidas en esa clase.
 * 
 * El uso de Interfaces me permite implemtentar diferentes tipos de interfaces a
 * la vez y as� modularizar mejor los programas. Simula la No existente herencia
 * m�ltiple en Java.
 * 
 * @author josem
 *
 */
public interface IAnimal {

	// Definici�n de m�todos - A implementar por clase hija.
	public void mostrarTipoAnimal();

	public String mostrarNombre();

}
