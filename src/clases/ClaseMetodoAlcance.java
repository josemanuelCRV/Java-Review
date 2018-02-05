package clases;

public class ClaseMetodoAlcance {

	// atributos de clase
	private String nombre;
	private int edad;
	private String alcance = "soy Global";

	// método de tipo void que no retorna valor, solo se ejecuta.
	public void saludar() {
		nombre = "Jose";
		edad = 35;
		System.out.println("Hola " + nombre);
		System.out.println("Edad: " + edad);
	}

	// mismo nombre de método pero recibe un parámetro. Lo hace ser diferente;
	public void saludar(String nombre) {
		System.out.println("Hola " + nombre);
	}

	public void despedir(String nombre) {
		System.out.println("Hasta pronto " + nombre);
	}

	// Método de tipo int debe retornar mismo tipo y además recibe un parámetro
	public int consultarEdad(int edad) {
		return edad;
	}

	// recibe parámetros
	public void describir(String nombre, int edad) {
		System.out.println("Descripción: Se llama " + nombre + " y tiene " + edad + " años");
	}

	// apunta a la variable global, cntrl + click
	public void variableGlobal() {
		System.out.println("Alcance: " + alcance);
	}

	// sólo vive el valor de la variable durante la ejecución del método
	public void variableLocal() {
		String alcance = "soy Local";
		System.out.println("Alcance: " + alcance);
	}

	// Método de Ejecución del programa.
	public static void main(String... args) {
		// instanciamos la clase para crear un objeto de tipo clase
		ClaseMetodoAlcance objetoClase = new ClaseMetodoAlcance();
		// accedemos por el objeto a los métodos de la clase y los invocamos
		objetoClase.saludar();
		objetoClase.saludar("Juan");
		objetoClase.despedir("Juan");

		// variable de tipo int para almacenar el retorno de consultarEdad()
		int recibido = objetoClase.consultarEdad(35);
		System.out.println(recibido);

		// variables globales inicializadas dentro del método saludar()
		objetoClase.describir(objetoClase.nombre, objetoClase.edad);

		objetoClase.variableGlobal();
		objetoClase.variableLocal();
	}

}
