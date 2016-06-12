package tuto5_Interfaces_ListasDinamicas.ListasDinamicas;

public class MainList {

	public static void main(String[] args) {

		// indicamos que la carga a recibir es de tipo <String>
		List<String> lista = new List<String>();
		lista.add("Jose");
		lista.add("Javier");
		lista.add("Fede");
		lista.imprimir();

		// nueva de tipo Integer
		// Ojo! utlizamos objetos genericos = tipos de clase
		// No tipos primitivos como int, double o float ERROR!
		// autoboxing = un tipo privitivo es contenido dentro de una clase
		List<Integer> lista2 = new List<Integer>();
		lista2.add(35); // hace el autoboxin
		lista2.add(44);
		lista2.add(new Integer(66)); // hacemos el autoboxing a mano
		lista2.imprimir();

		
		
		List<Persona> lista3 = new List<>();
		lista3.add(new Persona("Jose", 19));
		lista3.add(new Persona("Juan ", 50));
		lista3.imprimir();
		
 
		
	}

}
