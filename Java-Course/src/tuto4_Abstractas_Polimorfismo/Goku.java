package tuto4_Abstractas_Polimorfismo;

public class Goku extends Personaje{
	
	private String apellido;
	private boolean alerta;

	public Goku(String nombre, String imagen, int posX, int posY, String apellido, boolean alerta) {
		super(nombre, imagen, posX, posY);
		this.apellido = apellido;
		this.alerta = alerta;
		
	}
	
	
	
	// Obligatoriamente implementa los metodos de Personaje

	@Override
	protected void moverX() {
		 this.posX +=10; 
		
	}

	@Override
	protected void moverY() {
		this.posY += 10; 
		
	}

	@Override
	protected String saludar() {

		return "Hola me llamo " + this.nombre;
	}

	public String despedida(){
		return "Adiossss ";
	}


	@Override
	public String toString() {
		 
		return  "Nombre: " + nombre + "\nApellido: " + apellido + "\nImagen: " +  imagen + "\nPosición X: " + posX + "\nPosición Y: " + posY;
	}


 
	
	
	
	
	

}
