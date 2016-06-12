package tuto5_Interfaces_ListasDinamicas.ListasDinamicas;

public class Persona {

	private String nombre;
	private int edad;
	
	

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}





	@Override
	public String toString() {
		return "Se llama " + nombre + " Y tiene la edada de " + edad ;
	}
	
	
	
	
	
	
	
	
	
}
