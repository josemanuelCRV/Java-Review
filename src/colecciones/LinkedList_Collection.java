package colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Collection {

	public static void main(String[] args) {

		// Cada elemento de la lista tiene una referencia con su
		// próximo-siguiente.

		// List lista = new LinkedList();
		// lista.add(1);
		// lista.add("Hola");
		// lista.add(true);

		// List<Integer> lista = new LinkedList<Integer>();
		// lista.add(175);
		// lista.add(450);
		// lista.add(625);
		//
		// System.out.println("Tamaño de lista: " + lista.size());
		// System.out.println("Contenido posición 2: " + lista.get(1));
		// // ultimo elemento sin conocer su indice
		// System.out.println("Contenido último elemento: " +
		// lista.get(lista.size() - 1));

		System.out.println(
				"************************\nTest de rendimiento:\nArrayList vs LinkendList\n************************");
		///////// RENDIMIENTO ArrayList vs LinkedList /////////

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// *************** ADD test ***************
		long init_1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			arrayList.add(i);
		}
		long end_1 = System.currentTimeMillis();
		System.out.println("ArrayList ADD: " + (end_1 - init_1));
		// --------------------------------------------------------
		long init_2 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			linkedList.add(i);
		}
		long end_2 = System.currentTimeMillis();
		System.out.println("LinkedList ADD: " + (end_2 - init_2));

		// *************** GET test ***************
		long init_3 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			arrayList.get(i);
		}
		long end_3 = System.currentTimeMillis();
		System.out.println("ArrayList GET: " + (end_3 - init_3));
		// --------------------------------------------------------
		long init_4 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			linkedList.get(i);
		}
		long end_4 = System.currentTimeMillis();
		System.out.println("LinkedList GET: " + (end_4 - init_4));

		// *************** REMOVE test ***************
		long init_5 = System.currentTimeMillis();
		for (int i = 9999; i >= 0; i--) {
			arrayList.remove(i);
		}
		long end_5 = System.currentTimeMillis();
		System.out.println("ArrayList REMOVE: " + (end_5 - init_5));
		// --------------------------------------------------------
		long init_6 = System.currentTimeMillis();
		for (int i = 9999; i >= 0; i--) {
			linkedList.remove(i);
		}
		long end_6 = System.currentTimeMillis();
		System.out.println("LinkedList REMOVE: " + (end_6 - init_6));

		// ************************
		// Test de rendimiento (ms):
		// ArrayList vs LinkendList
		// ************************
		// ArrayList ADD: 4
		// LinkedList ADD: 2
		// ArrayList GET: 2
		// LinkedList GET: 62
		// ArrayList REMOVE: 1
		// LinkedList REMOVE: 2

		// LinkedList es mucho menos eficiente para recuperar get() debido a que
		// va verificando nodo tras nodo desde el primer elemento.

		// Recomendado utiliar ArrayList para operaciones de recuperar .get()
		// Utilizar LinkedList para operaciones de adción o borrado.

	}

}
