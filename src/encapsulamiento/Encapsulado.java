package encapsulamiento;

/**
 * 
 * Analogía: Clase es nuestra capsula, y el contenido son sus atributos y
 * métodos. No importa cómo esté implementado el cotenido de nuestras capsulas,
 * si no cómo se usan.
 * 
 * Como ejemplo, la clase String expone muchos métodos, pero no necesitamos conocer
 * qué hace exactamente split(); valueOf(); etc...
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
