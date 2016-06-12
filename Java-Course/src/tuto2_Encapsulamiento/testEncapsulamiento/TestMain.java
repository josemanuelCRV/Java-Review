package tuto2_Encapsulamiento.testEncapsulamiento;

import tuto2_Encapsulamiento.Personaje;

public class TestMain {

	public static void main(String[] args) {

		Personaje personaje3 = new Personaje();

		// Puede acceder al nombre del objeto Persona porque tiene encapsulador
		// "public"
		// al resto no se pueden porque estan por default o private y estamos
		// desde fuera del paquete.
		System.out
				.println("Acceso desde otro paquete a los métodos y atributos"
						+ " \n------------------------------------------------------- \n"
						+ "El nombre de personaje3 es: " + personaje3.nombre + "\n");

		
		
		// Podemos acceder a los atributos privados por medio de los metodo getter
		System.out.println("\nAcceso a atributos privados:\n----------------------------- \n");
		
		System.out.println("Privada Imágen : " + personaje3.getImagen());
		System.out.println("Privada Imágen : " + personaje3.getPosx());
		System.out.println("Privada Imágen : " + personaje3.getPosy());
		
		// Podemos Insertar en los atributos siendo privados por medio de los setter
		personaje3.setImagen("Imagen2 seteada desde TestMain");
		System.out.println("Privada Imágen Nueva: " +personaje3.getImagen());
		
		
		
		
	} // FIN MAIN
	
	
		
	
	

}
