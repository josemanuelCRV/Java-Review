package tuto2_Encapsulamiento;

public class Personaje {

	/**
	 * Encapsulamiento: Es una propiedad que se le puede aplicar a una entidad a
	 * un atributo, a una clase, a un objeto, a un metodo Para que tenga un
	 * alcance determinado
	 * 
	 */

	/*
	 * por defecto X -> Permite que se modifique o se consulte desde cualquier
	 * clase dentro del mismo paquete.
	 * 
	 * public X -> Se puede consultar o modificar en cualquier lugar, desde la
	 * misma clase o paquete.
	 * 
	 * private X -> Permite que sea consultado o modificado desde la clase
	 * UNICAMENTE.
	 * 
	 * protected X -> Permite que sea modificado desde la clase mismo paquete y
	 * desde clases que hereden a�n que esten en otro paquete.
	 */
	
	// atributos de clase declarados
	private int vida;
	public String nombre;
	protected String imagen;
	private int posx;
	private int posy;	
	
	// Constructor con atributos inicializados
	public Personaje(){
		this.vida = 0;
		this.nombre = "Jugardor";
		this.imagen = "imag1";
		this.posx = (int) (Math.random()*100);
		this.posy = (int) (Math.random()*100);

	}
	
	// Constructor con nombre por par�metro
	public Personaje(String name){
		this.nombre = name;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}
	
	
	// M�todo de soporte para poder mover
	/*
	 * el m�todo de algoritmoMovimiento es el que contiene la l�gica para moverse
	 * Pero no podr�amos usarlo fuera de la clase al ser "private".
	 * Por ello creamos un m�todo p�blico.
	 * 
	 * Explicaci�n del m�todo:
	 * recibe por par�metro int X movimiento, 
	 * da nuevo valor al atributo posx igualandolo 
	 * al valor que tenga + el resultado del metodo algoritmoMovimiento(esperoVariable)
	 * al que se le pasa por par�metro la variable "movimiento" que
	 * usabamos en el metodo publico mover(). 
	 * Para eso le pasamos un parametro, para poder usarlo en el metodo que llamamos 
	 * y que tmb espera recibir un parametro "possRelativa"
	 * 
	 */
	public void mover(int movimientos){
		this.posx = this.posx - this.algoritmoMovimiento(movimientos);
	}
	
	private int algoritmoMovimiento(int possRelativa){
		return (possRelativa - 80) *2 +5;
		
	}
	
	

}
