package tuto1_Clases_Objetos_Parametros_pck;

public class Personas {

	String nombre;
	int edad;
	int numPiernas;
	int numBrazos;
	String colorOjos;
	int vida;

	// Constructor con valores incializados
	public Personas() {
		this.nombre = "Pepe";
		this.edad = 34;
		this.numPiernas = 2;
		this.numBrazos = 2;
		this.colorOjos = "marrón";
		this.vida = 100;

	}

	// Constructor con parametros -Polimorfismo por sobrecarga
	public Personas(String nombre, int edad, int numPiernas, int numBrazos,
			String colorOjos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.numPiernas = numPiernas;
		this.numBrazos = numBrazos;
		this.colorOjos = colorOjos;
		this.vida = 100;

	}
	
	public String saluda(){
		return "Hola mi nombre es " + this.nombre;
	}
	
	public void cambiarNombre(String name){
		this.nombre = name;
	}
	
	public void enfermar(int puntosVida){
		this.vida -= puntosVida; 
	}
	
	public void comer(int puntosVida){
		this.vida += puntosVida;
	}
	

}
