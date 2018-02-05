package colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Collection {

	public static void main(String[] args) {

		// El orden devuelto por HasSet puede ser arbitrario.
		// No permite valores duplicados, y los que sean no los imprimirá.
		Set<String> conjunto = new HashSet<String>();
		conjunto.add("a");
		conjunto.add("a");
		conjunto.add("i");
		conjunto.add("a");
		conjunto.add("u");

		for (String elem : conjunto) {
			System.out.println(elem);
		}

		// Para garantizar un orden en particular, podemos apoyarnos en TreeSet
		// o LinkedList_HashSet
		System.out.println("");

		Set<String> lista = new TreeSet<>();
		lista.add("a");
		lista.add("a");
		lista.add("i");
		lista.add("a");
		lista.add("u");

		for (String elem : lista) {
			System.out.println(elem);
		}

	}

}
