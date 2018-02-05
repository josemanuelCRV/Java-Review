package herencia;

public class Main {

	public static void main(String[] args) {

		// Instancia del objeto de clase Perro, a través de su constructor, el
		// cual hereda los constructores de todas las clases superiores.
		Perro perro = new Perro("Perro", "", 7, "oseo", "vivíparo", "", 9, "terrestre", "Pitbull", "caza mayor");

		perro.mostrar();

		// settingAllValues();

	}

	// Sin constructor heredado desde la clase Animal--->Perro.
	// Utiliza el constructor por defecto de cada la super-clase.
	// private static void settingAllValues() {
	// Perro perro = new Perro();
	// perro.setNombre("Perro");
	// perro.setEdad(7);
	// perro.setAlimentacion("obnivoro");
	// perro.setEsqueleto("oseo");
	// perro.setReproduccion("vivíparo");
	// perro.setHabitat("terrestre");
	// perro.setTiempoLactancia(9);
	// perro.setRaza("Pitbull");
	// perro.setPotencial("caza mayor");
	// perro.mostrar();
	// }

}
