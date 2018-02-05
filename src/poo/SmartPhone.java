package poo;

public class SmartPhone {

	String nombre;
	String color;

	// Constructor es el método que se invoca cuando una clase es instanciada.
	// public SmartPhone() {
	// super();
	// }

	// Cosntructor con parámetros
	public SmartPhone(String nombre, String color) {
		// variables de instancia tomarán los valores recibidos por parámetro
		this.nombre = nombre;
		this.color = color;
	}

	public void llamar() {
		System.out.println("Llamando...\ndesde Móvil: " + nombre + " de color " + color);
	}

	// Recibe por parámetro un Objeto en lugar de variables.
	// Cuando reciba el objeto movil1 obtendrá de él sus valores,
	// no los indicados en el constructor al crear el objeto, ("LG" y "Gris")
	public void llamarEspecial(SmartPhone phone) {
		System.out.println(phone.nombre + " " + phone.color + " hace llamadaEspecial");
	}

}
