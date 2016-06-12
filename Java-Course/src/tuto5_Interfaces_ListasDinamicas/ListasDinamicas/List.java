package tuto5_Interfaces_ListasDinamicas.ListasDinamicas;

// Clase de tipo generico

public class List<T> {

	// posición de inicion en el Nodo
	private Nodo inicio;

	/**
	 * Constructor vacio para inciar la creación de la Lista sin posición
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

	// añado un tipo generico --> T object
	// nodo element con la carga util ingresada
	/**
	 * Metodo para añadir a la lista genérica un objeto genérico List<T> add(T
	 * object)
	 * 
	 * @param object
	 */
	public void add(T object) {
		Nodo objAdded = new Nodo(object);

		// si es nulo es que no hay ningún elemento inicial
		if (inicio == null) {
			this.inicio = objAdded;
		} else {
			Nodo aux; // el nodo auxiliar

			// empiezo en inicio, si en el siguiente hay algo, avanza
			for (aux = inicio; aux.getNext() != null; aux = aux.getNext())
				;
			aux.putNext(objAdded);
			// desde la nueva posición ingresa denrto de nextNodo

		}
	}

	public void imprimir() {
		// empiezo en inicio, si inicio es distinto a null, avanza
		for (Nodo aux = inicio; aux != null; aux = aux.getNext()) {
			System.out.println(aux.getObjetoTclass().toString());
			// no pongo aux.getNext() porque al llegar al ultimo
			// comprobaria que el de al lado (donde va la referencia al
			// siguiente)
			// es nulo y saldría del bucle

		}

	}

}
