package tuto3_Herencia;

public class MainVehiculos {

	public static void main(String[] args) {

		/**
		 * VEH�CULO GENERICO - Hereda sus propiedades:
		 * (marca, ruedas, color, posicion, velocidad);
		 */
		Vehiculo vehiculo1 = new Vehiculo("Ford", 4, "azul", 75, 163);
		System.out.println("\nVeh�culo gen�rico: " + vehiculo1.toString());
		vehiculo1.mover(25); // mover del metodo de veh�culo
		System.out.println("Nueva posici�n: " + vehiculo1.getPosicion());
		

		
		
		
		/**
		 * Coche hereda propiedaddes del Vehiculo + Propias:
		 * (marca, ruedas, color, posicion, velocidad, ventanas, caballos);
		 */
 
		Coche coche1 = new Coche("Audi", 8, "Gris", 60, 10, 5, 199);
		System.out.println("\nCoche heredando de Vehiculo: " + coche1.toString());
		
		/**
		 * metodo publico de servicio de la clase Coche
		 * El movimiento que da este metodo es distinto al del movimiento de Vehiculo
		 * Si no tuviese Coche el metodo sobrescrito usar�a el metodo mover de Vehiculo por herencia
		 * Ese metodo nos devolver�a la posici�n actual * 
		 */
		
		
		coche1.mover(2);
		System.out.println("Nueva posici�n: " + coche1.getPosicion());

	}

}
