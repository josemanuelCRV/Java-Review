package interfaces;

public class Main {

	public static void main(String[] args) {


		// Uso e implementaci�n de una interfaz
		
		Lobo lobo =  new Lobo();
		String nombre = lobo.mostrarNombre();
		System.out.println(nombre);
		lobo.mostrarTipoAnimal();
		lobo.mostrarVida();
	}

}
