package clases;

public class ClaseMetodoAlcance {

	// atributos de clase
	private String nombre;
	private int edad;
	private String alcance = "soy Global";

	// m�todo de tipo void que no retorna valor, solo se ejecuta.
	public void saludar() {
		nombre = "Jose";
		edad = 35;
		System.out.println("Hola " + nombre);
		System.out.println("Edad: " + edad);
	}

	// mismo nombre de m�todo pero recibe un par�metro. Lo hace ser diferente;
	public void saludar(String nombre) {
		System.out.println("Hola " + nombre);
	}

	public void despedir(String nombre) {
		System.out.println("Hasta pronto " + nombre);
	}

	// M�todo de tipo int debe retornar mismo tipo y adem�s recibe un par�metro
	public int consultarEdad(int edad) {
		return edad;
	}

	// recibe par�metros
	public void describir(String nombre, int edad) {
		System.out.println("Descripci�n: Se llama " + nombre + " y tiene " + edad + " a�os");
	}

	// apunta a la variable global, cntrl + click
	public void variableGlobal() {
		System.out.println("Alcance: " + alcance);
	}

	// s�lo vive el valor de la variable durante la ejecuci�n del m�todo
	public void variableLocal() {
		String alcance = "soy Local";
		System.out.println("Alcance: " + alcance);
	}

	// M�todo de Ejecuci�n del programa.
	public static void main(String... args) {
		// instanciamos la clase para crear un objeto de tipo clase
		ClaseMetodoAlcance objetoClase = new ClaseMetodoAlcance();
		// accedemos por el objeto a los m�todos de la clase y los invocamos
		objetoClase.saludar();
		objetoClase.saludar("Juan");
		objetoClase.despedir("Juan");

		// variable de tipo int para almacenar el retorno de consultarEdad()
		int recibido = objetoClase.consultarEdad(35);
		System.out.println(recibido);

		// variables globales inicializadas dentro del m�todo saludar()
		objetoClase.describir(objetoClase.nombre, objetoClase.edad);

		objetoClase.variableGlobal();
		objetoClase.variableLocal();
	}

}
