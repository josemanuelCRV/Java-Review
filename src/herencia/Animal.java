package herencia;

/**
 * Animal: Clase principal de la que hereda cualquier animal.
 * 
 * Subtipos: Vertebrados e invertebrados.
 * 
 * Sub-subtipos de Vertebrados: mamíferos, aves, peces, anfibios y reptiles
 * 
 * @author josem
 *
 */
public class Animal {

	private String nombre;
	private String alimentacion;
	private int edad;

	// Las clases que hereden de esta, deben implementar un constructor que
	// llame a alguno de los métodos Constructores de Animal

	// Constructo por defecto.
	public Animal() {

	}

	// Este constructor implica a las clases que hereden de esta que deben
	// implementar un constructor que reciba los parámetros de esta clase.
	public Animal(String nombre, String alimentacion, int edad) {
		super();
		this.nombre = nombre;
		this.alimentacion = alimentacion;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
