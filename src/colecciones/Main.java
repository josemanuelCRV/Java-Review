package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Una Coleccion de objetos es un objeto que puede almacenar un número variable
 * de elementos siendo cada elemento otro objeto. (Una caja que contiene más
 * cajas dentro). Puede haber distintas colecciones de tamaño flexible, que se
 * puedan encoger o agrandar en función de las necesidades.
 * 
 * (I): Interfaz (C): Clases que implementan la Interfaz.
 * 
 * 
 * (I) Itereable:
 * 
 * (I) Collection [
 * 
 * (I) - List: [(C)ArrayList, (C)LinkedList, (C)Vecto···Stack]
 * 
 * (I) - Queue: [(C)PrioriryQueue, (I)Deque<--(C)ArrayDeque]
 *
 * (I) - Set: [(C)HashSet, (C)LinkedList_HashSet, (I)ShortSet<--(C)TreeSet, ]
 * 
 * ]
 * 
 * 
 * Mapas: (I) Maps
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Main {

	public static void main(String[] args) {

		// El objeto lista pertenece a la interfaz List de tipo de datos String,
		// pero que a su vez estoy generando una instancia de la clase
		// ArrayList(). No se puede hacer una instancia de la interfaz, por eso
		// nos apoyamos en su clase que implementa la interfaz.
		List<String> lista = new ArrayList<String>();
		lista.add("Hola");
		lista.add("Jose");
		lista.add("Bienvenido");

		// for(String elem : lista){
		// System.out.println(elem);
		// }

		// Utilizando la clase Iterator que implementa la interfaz Itereable.
		Iterator<String> iterador = lista.iterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next());

		}

	}

}
