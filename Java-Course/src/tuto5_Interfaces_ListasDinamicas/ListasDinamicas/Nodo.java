package tuto5_Interfaces_ListasDinamicas.ListasDinamicas;

/**
 * Listas dinámicas: Cada nodo tine un contenido y una referencia al siguiente
 * nodo
 * 
 * Convenciones para Tipos genéricos <T> type - <K> key - <N> number - <U>
 * undefined
 * 
 * @author JoseManuelCRV
 *
 *         carga de tipo genérico que recibe
 * @param <T>
 */

public class Nodo<T> {

	private T objeto;
	private Nodo nextNodo; // referencia al siguiente Nodo

	/**
	 * Constructor con parametro que recibe un objeto genérico de tipo T Para la
	 * creación, sin definir dirección al siguienteNodo
	 * 
	 * @param objectRecibido
	 */
	public Nodo(T objectRecibido) {
		this.objeto = objectRecibido;
		this.nextNodo = null; //
	}

	/**
	 * Guardamos la dirección al siguiente Nodo, que es recibida por parámetro
	 * 
	 * @param nodoParam
	 */
	public void putNext(Nodo nodoParam) {
		this.nextNodo = nodoParam;

	}

	/**
	 * Comprobar si hay siguiente dirección de nodo
	 * 
	 * @return la dirección al siguiente
	 */
	public Nodo getNext() {
		return this.nextNodo;

	}

	// nos permite acceder y recibir el objeto ya que es private
	/**
	 * Método para el acceso al objeto que recibe la clase en Nodo<T>. Dado que
	 * T es private, creamos metodo público para su acceso.
	 * 
	 * @return
	 */
	public T getObjetoTclass() {
		return objeto;
	}

}
