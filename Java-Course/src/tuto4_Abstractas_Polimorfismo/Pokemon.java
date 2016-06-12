package tuto4_Abstractas_Polimorfismo;

public class Pokemon extends Personaje{
	
	private String color;

	public Pokemon(String nombre, String imagen, int posX, int posY, String color) {
		super(nombre, imagen, posX, posY);
		this.color = color;
		
	}

	// Obligatoriamente implementa los metodos de Personaje

		@Override
		protected void moverX() {
			 this.posX +=1; 
			
		}

		@Override
		protected void moverY() {
			this.posY += 1; 
			
		}

		@Override
		protected String saludar() {

			return "Woooo soy " + this.nombre;
		}



	@Override
	public String toString() {
		return  "Nombre: " + nombre +   "\nImagen: " +  imagen + "\nPosición X: " + posX + "\nPosición Y: " + posY + "\nColor: " + color;
	}
	
	
	
	
	
	
	

}
