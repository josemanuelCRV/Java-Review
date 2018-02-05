package herencia;

public class Perro extends Mamiferos {

	private String raza;
	private String potencial;

	// inlcuye todos los atributos que se heredaron. Esto requiere que todos los
	// datos sean proporcionados y sean enviados al constructor de la clase de la que
	// hereda, super().
	public Perro(String nombre, String alimentacion, int edad, String esqueleto, String reproduccion, String tempSangre,
			int tiempoLactancia, String habitat, String raza, String potencial) {
		super(nombre, alimentacion, edad, esqueleto, reproduccion, tempSangre, tiempoLactancia, habitat);
		this.raza = raza;
		this.potencial = potencial;
	}

	public String getRaza() {
		return raza;
	}

	public String getPotencial() {
		return potencial;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setPotencial(String potencial) {
		this.potencial = potencial;
	}

	public void mostrar() {
		System.out.println("El animal " + getNombre() + " tiene una esperanza de vida de " + getEdad()
				+ " años.\nPertenece al grupo de los " + Vertebrados.class.getSimpleName().toLowerCase()
				+ ", su esqueleto es " + getEsqueleto() + " y se reproduce como " + getReproduccion()
				+ ".\nSu habitat es  " + getHabitat() + " y su periodo de lactancia dura " + getTiempoLactancia()
				+ " meses.\nPertenece a la raza de " + getRaza() + " y destaca en la cualidad de " + getPotencial());
	}

}
