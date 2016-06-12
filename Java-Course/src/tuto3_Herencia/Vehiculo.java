package tuto3_Herencia;

public class Vehiculo {

	// Encapsulamiento
	// private -solo accesible desde la propia clase  - dafault - public
	// ***  protected: solo accesible desde las clases del mismo paquete y desde clases que heredan de esta
	// default: solo accesible desde propio paquete
	// public: desde todos los sitios
	
	protected String marca;
	protected int ruedas;
	protected String color;
	protected int posicion;
	protected int velocidad;
	private String dueño; //No se heredará al crear nuevo objeto genérico al ser atributo privado
	
	
	
	public Vehiculo(String marca, int ruedas, String color, int posicion,int velocidad ) {
		super();
		this.marca = marca;
		this.ruedas = ruedas;
		this.color = color;
		this.posicion = posicion;
		this.velocidad = velocidad;
 
	}
	
	
	
	// metodo de SOPORTE llevan private y sólo son accesibles desde la misma clase.
	// entrada tiempo * velocida entrada 
	private int movimientoRelativo(int tiempo){
		return tiempo * velocidad;
		
	}
	
	// metodos de SERVICIO que nos provee de movimiento, es public y llama a un metodo privado para devolver algo
	// posición actual + resultado de movimientoRelativo (entrada tiempo * velocida entrada )
	public void mover(int tiempo){
		this.posicion += movimientoRelativo(tiempo);
	}



	public int getPosicion() {
		return posicion;
	}



	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}



	@Override
	public String toString() {
		return "\nMarca=" + marca + "\nRuedas=" + ruedas + "\nColor="
				+ color + "\nPosicion Origen=" + posicion + "\nVelocidad=" + velocidad
				+ "\nDueño=" + dueño ;
	}
	
	
	
	
}
