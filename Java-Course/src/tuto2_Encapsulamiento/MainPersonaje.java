package tuto2_Encapsulamiento;

public class MainPersonaje {

	public static void main(String[] arg) {

		Personaje personaje1 = new Personaje();
		System.out.println("Por defecto: " + personaje1.nombre
				+ "\n Posici�n X: " + personaje1.getPosx() + "\n Posici�n Y: "
				+ personaje1.getPosy());

		Personaje personaje2 = new Personaje("Jose");
		System.out.println("Por par�metro: " + personaje2.nombre);

		System.out.println("Im�gen protected accedida desde mismo paquete: "
				+ personaje1.imagen);
		System.out.println("La vida est� en public: " + personaje1.nombre
				+ "\n");

		// Accediendo a m�todos de soporte:
		// Llamamos al metodo de soporte p�blico que �l a su vez llamar� a un
		// m�todo private"algoritmoMovimiento" que hace el cambio de X y al que
		// no podr�amos acceder.
		// Protegemos la posibilidad de poder cambiar los valores del
		// algoritmo, teniendo que acceder mediante el m�todo de soporte.

		System.out.println("Posici�n antigua de X: " + personaje1.getPosx());
		personaje1.mover(100);
		System.out.println("Nueva posici�n de X: " + personaje1.getPosx());

	}

}
