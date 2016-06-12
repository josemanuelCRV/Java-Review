package tuto2_Encapsulamiento_Out_pack;

import tuto2_Encapsulamiento.Personaje;

public class TestMainOut {

	public static void main(String[] args) {
		 
		
		Personaje personaje4 = new Personaje();
		personaje4.setImagen("nueva desde fuera del Paquete");	
		System.out.println(personaje4.getImagen());
		
		// se puede usar el constructor con el parametro para el nombre porque 
		// el atributo es público. si es private tendríamos que usar los getter y setter.
		Personaje personaje5 = new Personaje("Juan");
		System.out.println("Nombre: " + personaje5.nombre);

	}

}
