package interfaces;

public class Lobo implements IAnimal, SerVivo {

	
	
	
	@Override
	public void mostrarTipoAnimal() {
		System.out.println("Soy un mamifero, Lobo");
		
	}

	@Override
	public String mostrarNombre() {
	
		return "Kavic";
	}

	// Método de la 2ª interfaz implementada en la clase.
	@Override
	public void mostrarVida() {
		System.out.println("Tengo 100% de vida");
		
	}

}
