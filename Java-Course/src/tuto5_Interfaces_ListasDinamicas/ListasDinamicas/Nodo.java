package tuto5_Interfaces_ListasDinamicas.ListasDinamicas;

/**
 * Listas din�micas: Cada nodo tine un contenido y una referencia al siguiente
 * nodo
 * 
 * Convenciones para Tipos gen�ricos <T> type - <K> key - <N> number - <U>
 * undefined
 * 
 * @author JoseManuelCRV
 *
 *         carga de tipo gen�rico que recibe
 * @param <T>
 */

public class Nodo<T> {

	private T objeto;
	private Nodo nextNodo; // referencia al siguiente Nodo

	/**
	 * Constructor con parametro que recibe un objeto gen�rico de tipo T Para la
	 * creaci�n, sin definir direcci�n al siguienteNodo
	 * 
	 * @param objectRecibido
	 */
	public Nodo(T objectRecibido) {
		this.objeto = objectRecibido;
		this.nextNodo = null; //
	}

	/**
	 * Guardamos la direcci�n al siguiente Nodo, que es recibida por par�metro
	 * 
	 * @param nodoParam
	 */
	public void putNext(Nodo nodoParam) {
		this.nextNodo = nodoParam;

	}

	/**
	 * Comprobar si hay siguiente direcci�n de nodo
	 * 
	 * @return la direcci�n al siguiente
	 */
	public Nodo getNext() {
		return this.nextNodo;

	}

	// nos permite acceder y recibir el objeto ya que es private
	/**
	 * M�todo para el acceso al objeto que recibe la clase en Nodo<T>. Dado que
	 * T es private, creamos metodo p�blico para su acceso.
	 * 
	 * @return
	 */
	public T getObjetoTclass() {
		return objeto;
	}

}
