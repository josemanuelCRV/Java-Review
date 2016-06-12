package tuto2_Encapsulamiento;

public class MainPersonaje {

	public static void main(String[] arg) {

		Personaje personaje1 = new Personaje();
		System.out.println("Por defecto: " + personaje1.nombre
				+ "\n Posición X: " + personaje1.getPosx() + "\n Posición Y: "
				+ personaje1.getPosy());

		Personaje personaje2 = new Personaje("Jose");
		System.out.println("Por parámetro: " + personaje2.nombre);

		System.out.println("Imágen protected accedida desde mismo paquete: "
				+ personaje1.imagen);
		System.out.println("La vida está en public: " + personaje1.nombre
				+ "\n");

		// Accediendo a métodos de soporte:
		// Llamamos al metodo de soporte público que él a su vez llamará a un
		// método private"algoritmoMovimiento" que hace el cambio de X y al que
		// no podríamos acceder.
		// Protegemos la posibilidad de poder cambiar los valores del
		// algoritmo, teniendo que acceder mediante el método de soporte.

		System.out.println("Posición antigua de X: " + personaje1.getPosx());
		personaje1.mover(100);
		System.out.println("Nueva posición de X: " + personaje1.getPosx());

	}

}
