package colecciones;

import java.util.HashMap;
import java.util.Map;

/**
 * Interfaz Map y en concreto la clase que implenta la interfaz, HashMap.
 * 
 * Permite implementar un Dicionario en Java. Nos permite tener varios
 * elementos, y a cada elemento le vamos a asociarle un ID o Key para
 * referenciarlo y acceder al elemento.
 * 
 * 
 * @author josem
 *
 */
public class HashMap_Collection {

	public static void main(String[] args) {

		// Map diccionario = new HashMap(); // Por interfaz
		HashMap diccionario = new HashMap(); // Por clase
		diccionario.put("user", "Jose");
		diccionario.put("age", "35");
		diccionario.put("mail", "jmc@g.com");

		// get("user") devuelve un objeto, requiere casteo apoyo con toString()
		// String contenido = diccionario.get("user").toString();
		System.out.println(diccionario.get("user"));

		
		boolean match = diccionario.containsKey("casa");
		System.out.println(match);
		
		
	}

}
