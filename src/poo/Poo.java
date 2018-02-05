package poo;

public class Poo {

	public static void main(String[] args) {

		// polimorfismo, cohexi�n, herencia...

		// Objeto movil - Instancia de la clase SmartPhone
		// Utilizo un constructor de objeto que recibe par�metros
		SmartPhone movil1 = new SmartPhone("iPhone", "Blanco");
		movil1.llamar();

		// Genero tantos objetos de esa clase como necesite
		SmartPhone movil2 = new SmartPhone("Samsung", "Negro");
		movil2.llamar();

		// Creo otro objeto con el constructor e invoco al m�todo que espera
		// recibir un Objeto por par�metro. Le paso el movil-1
		// los valores del
		SmartPhone movil3 = new SmartPhone("LG", "Gris");
		movil3.llamarEspecial(movil1);
	}

}
