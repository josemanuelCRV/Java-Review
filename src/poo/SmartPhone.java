package poo;

public class SmartPhone {

	String nombre;
	String color;

	// Constructor es el m�todo que se invoca cuando una clase es instanciada.
	// public SmartPhone() {
	// super();
	// }

	// Cosntructor con par�metros
	public SmartPhone(String nombre, String color) {
		// variables de instancia tomar�n los valores recibidos por par�metro
		this.nombre = nombre;
		this.color = color;
	}

	public void llamar() {
		System.out.println("Llamando...\ndesde M�vil: " + nombre + " de color " + color);
	}

	// Recibe por par�metro un Objeto en lugar de variables.
	// Cuando reciba el objeto movil1 obtendr� de �l sus valores,
	// no los indicados en el constructor al crear el objeto, ("LG" y "Gris")
	public void llamarEspecial(SmartPhone phone) {
		System.out.println(phone.nombre + " " + phone.color + " hace llamadaEspecial");
	}

}
