package tuto1_Clases_Objetos_Parametros_pck;

import tuto1_Clases_Objetos_Parametros_pck.Personas;

public class Main {

	public static void main(String[] args) {

		// instanciamos un objeto de la clase Personas

		Personas persona1 = new Personas();
		System.out.println("\nPersona 1: " + "\n-------------------------\n"
				+ "Nombre: " + persona1.nombre + "\nColor de ojos: "
				+ persona1.colorOjos);
		System.out.println(persona1.saluda()
				+ "\n");

		// Objeto persona 2 pasandole por parametro los valores al constructor
		// con parametros de la clase Persona
		Personas persona2 = new Personas("Raquel", 32, 1, 2, "azules");
		System.out.println("Persona 2 por parámetro: " + "\n-------------------------\n"
				+ "Nombre: " + persona2.nombre + "\nColor de ojos: "
				+ persona2.colorOjos);
		// saluda con el nombre que tenga este objeto
		System.out.println(persona2.saluda()
				+ "\n");
		
		
		// Cambio de nombre
		persona2.cambiarNombre("Manuel");
		System.out.println("Ahora me llamo " + persona2.nombre + "\n----------------------");
		
		
		// Cambio de vida
		System.out.println("Vida original person1: " + persona2.vida );		
		persona2.enfermar(20);
		System.out.println("Vida tras enfermar person1: " + persona2.vida);
		persona2.comer(30);
		System.out.println("Vida tras comer person1: " + persona2.vida + "\n");
		
		// Objetos de tipo String
		System.out.println("Objetos de tipo String\n----------------------");
		String userName = new String("Josuit");
		System.out.println(userName);
		
	}

}
