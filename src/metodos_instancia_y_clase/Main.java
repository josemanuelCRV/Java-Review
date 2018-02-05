package metodos_instancia_y_clase;

public class Main {

	public static void main(String[] args) {

		Persona persona = new Persona();
		persona.setNombre("Jorge");
		persona.setEdad(54);

		// El m�todo de instancia, solo puede ser accedidos por una
		// instancia u obeto de la clase.
		persona.mostrarDeInstancia();

		// El m�todo static de clase es accedido directamente a trav�s de la
		// definici�n de clase.
		Persona.mostrarDeClase();

		// Por eso el m�todo Main es est�tico, porque al iniciar la aplicaci�n
		// no hay objetos y necesita acceder a la definici�n de la clase.

	}

}
