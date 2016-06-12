package tuto3_Herencia;

public class Coche extends Vehiculo {
	
	
	private int ventanas;
	private int caballos;
	
	public Coche(String marca, int ruedas, String color, int posicion, int velocidad, int ventanas, int caballos) {		
		super(marca, ruedas, color, posicion, velocidad);
		this.ventanas = ventanas; 
		this.caballos = caballos;
		
	}

	// Metodo sobrescrito perteneciente a la clase Vehiculo
	// 10 * random 99
	
	@Override
	public void mover(int tiempo) {
 		super.mover(tiempo);
 		this.posicion += (int)(Math.random()*99);  
	}

	@Override
	public String toString() {
 		return super.toString() + "\nVentanas: " + ventanas + "\nCaballos: " + caballos;
	}
	
	
	
	
 
	 

}
