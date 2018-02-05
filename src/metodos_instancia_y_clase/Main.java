package metodos_instancia_y_clase;

public class Main {

	public static void main(String[] args) {

		Persona persona = new Persona();
		persona.setNombre("Jorge");
		persona.setEdad(54);

		// El método de instancia, solo puede ser accedidos por una
		// instancia u obeto de la clase.
		persona.mostrarDeInstancia();

		// El método static de clase es accedido directamente a través de la
		// definición de clase.
		Persona.mostrarDeClase();

		// Por eso el método Main es estático, porque al iniciar la aplicación
		// no hay objetos y necesita acceder a la definición de la clase.

	}

}
