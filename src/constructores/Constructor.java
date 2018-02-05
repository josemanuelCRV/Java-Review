package constructores;

public class Constructor {

	private String nombre;
	private int edad;

	/**
	 * El Constructor es un m�todo en particular que se invoca cuando un objeto
	 * es instanciado. Dicho de otro modo, es el m�todo que crea la clase. Tiene
	 * siempre el mismo nombre que la clase. pero puede tener distinta cantidad
	 * de par�metros.
	 * 
	 * El m�todo Constructor puede tener par�metros o no. Si no creamos un
	 * constructor, Java por defecto crear� un m�todo Constructor sin cuerpo de
	 * m�todo ni par�metros. A�n que no lo codifiquemos, Java lo incluye de
	 * forma invisible.
	 */

	// Constructor Java por defecto. Realmente dentro tiene el m�todo super();
	// que invoca a la
	// clase de la que hereda la clase Contructor, que es la clase Object,
	// porque todo hereda de Object en Java. Es la Super Case.
	// public Constructor() {
	// // super();
	// }

	// Se pueden tener diferentes constructores siempre que no sean iguales al
	// tener mismos par�metros.
	public Constructor(String nombre) {
		this.nombre = nombre;
	}

	public Constructor(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void llamar() {
		System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " a�os");
	}

	public static void main(String... args) {

		// Este constructor Java lo reconoce a�n que no lo tengamos en el
		// c�digo. Siempre que no tengamos otros constructores.
		// Constructor constructor1 = new Constructor();

		Constructor constructor2 = new Constructor("Jose");
		Constructor constructor3 = new Constructor("Pedro", 33);

		// Este constructo2 invoca al m�todo Cconstructor que solo tiene definido
		// 1 par�metro, y al invocar al m�todo llamar(), cuando tenga que
		// imprimir nombre y edad, edad tendr� valor null.
		constructor2.llamar();
		constructor3.llamar();
	}

}
