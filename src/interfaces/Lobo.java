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

	// M�todo de la 2� interfaz implementada en la clase.
	@Override
	public void mostrarVida() {
		System.out.println("Tengo 100% de vida");
		
	}

}
