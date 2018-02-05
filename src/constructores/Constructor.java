package constructores;

public class Constructor {

	private String nombre;
	private int edad;

	/**
	 * El Constructor es un método en particular que se invoca cuando un objeto
	 * es instanciado. Dicho de otro modo, es el método que crea la clase. Tiene
	 * siempre el mismo nombre que la clase. pero puede tener distinta cantidad
	 * de parámetros.
	 * 
	 * El método Constructor puede tener parámetros o no. Si no creamos un
	 * constructor, Java por defecto creará un método Constructor sin cuerpo de
	 * método ni parámetros. Aún que no lo codifiquemos, Java lo incluye de
	 * forma invisible.
	 */

	// Constructor Java por defecto. Realmente dentro tiene el método super();
	// que invoca a la
	// clase de la que hereda la clase Contructor, que es la clase Object,
	// porque todo hereda de Object en Java. Es la Super Case.
	// public Constructor() {
	// // super();
	// }

	// Se pueden tener diferentes constructores siempre que no sean iguales al
	// tener mismos parámetros.
	public Constructor(String nombre) {
		this.nombre = nombre;
	}

	public Constructor(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void llamar() {
		System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años");
	}

	public static void main(String... args) {

		// Este constructor Java lo reconoce aún que no lo tengamos en el
		// código. Siempre que no tengamos otros constructores.
		// Constructor constructor1 = new Constructor();

		Constructor constructor2 = new Constructor("Jose");
		Constructor constructor3 = new Constructor("Pedro", 33);

		// Este constructo2 invoca al método Cconstructor que solo tiene definido
		// 1 parámetro, y al invocar al método llamar(), cuando tenga que
		// imprimir nombre y edad, edad tendrá valor null.
		constructor2.llamar();
		constructor3.llamar();
	}

}
