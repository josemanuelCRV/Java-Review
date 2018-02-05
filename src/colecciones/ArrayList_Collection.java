package colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Diferencia de rendimiento al definir la capacidad/tamaño de la Lista
 * 
 * @author josem
 *
 */
public class ArrayList_Collection {

	public static void main(String[] args) {

		long inicio1 = System.currentTimeMillis();
		List<Integer> lista1 = new ArrayList<Integer>();
		for (int i = 0; i < 10000; i++) {
			lista1.add(i);
		}
		long fin1 = System.currentTimeMillis();
		System.out.println("Undefined Capacity: " + (fin1 - inicio1) + " milisegundos");


		long inicio2 = System.currentTimeMillis();
		List<Integer> lista2 = new ArrayList<Integer>(10000);
		for (int i = 0; i < 10000; i++) {
			lista2.add(i);
		}
		long fin2 = System.currentTimeMillis();
		System.out.println("Capacity of 10000: " + (fin2 - inicio2) + " milisegundos");

	}

}
