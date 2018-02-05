package encapsulamiento;

/**
 * 
 * Analog�a: Clase es nuestra capsula, y el contenido son sus atributos y
 * m�todos. No importa c�mo est� implementado el cotenido de nuestras capsulas,
 * si no c�mo se usan.
 * 
 * Como ejemplo, la clase String expone muchos m�todos, pero no necesitamos conocer
 * qu� hace exactamente split(); valueOf(); etc...
 * 
 *
 */
public class Encapsulado {

	public static void main(String[] args) {
		String texto = "Hola,Mundo";
		String[] vector = texto.split(",");
		

		for(String e : vector){
		System.out.println(e);
		}
	}
	
}
