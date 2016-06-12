package tuto5_Interfaces_ListasDinamicas;

public class Goku extends Personajes{

	private String ataque;
	
	public Goku(String nombre, int posX, int posY, String ataque) {
		super(nombre, posX, posY);	
		this.ataque = ataque;
		 
	}

	
	
	// metodo implementado obligatoriamente al
	// extender esta clase de Personaje
	// en la que al ser abstract se ha permitido no sobrescribir
	// el metodo de la interfaz Acciones, pero la clase hija 
	// que extienda está obilgada a sebrescribir lo que falte.
	
	@Override
	public void atack() {

		
	}
	

}
