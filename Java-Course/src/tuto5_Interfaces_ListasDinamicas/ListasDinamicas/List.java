package tuto5_Interfaces_ListasDinamicas.ListasDinamicas;

// Clase de tipo generico

public class List<T> {

	// posici�n de inicion en el Nodo
	private Nodo inicio;

	/**
	 * Constructor vacio para inciar la creaci�n de la Lista sin posici�n
	 */
	public List() {
		inicio = null;

	}

	/**
	 * Con parametro iniciamos la lista con un nuevo objeto inicial
	 * 
	 * @param carga
	 */
	public List(T carga) {
		inicio = new Nodo(carga);
	}

	// a�ado un tipo generico --> T object
	// nodo element con la carga util ingresada
	/**
	 * Metodo para a�adir a la lista gen�rica un objeto gen�rico List<T> add(T
	 * object)
	 * 
	 * @param object
	 */
	public void add(T object) {
		Nodo objAdded = new Nodo(object);

		// si es nulo es que no hay ning�n elemento inicial
		if (inicio == null) {
			this.inicio = objAdded;
		} else {
			Nodo aux; // el nodo auxiliar

			// empiezo en inicio, si en el siguiente hay algo, avanza
			for (aux = inicio; aux.getNext() != null; aux = aux.getNext())
				;
			aux.putNext(objAdded);
			// desde la nueva posici�n ingresa denrto de nextNodo

		}
	}

	public void imprimir() {
		// empiezo en inicio, si inicio es distinto a null, avanza
		for (Nodo aux = inicio; aux != null; aux = aux.getNext()) {
			System.out.println(aux.getObjetoTclass().toString());
			// no pongo aux.getNext() porque al llegar al ultimo
			// comprobaria que el de al lado (donde va la referencia al
			// siguiente)
			// es nulo y saldr�a del bucle

		}

	}

}
