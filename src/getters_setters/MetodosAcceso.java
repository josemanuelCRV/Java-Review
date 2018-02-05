package getters_setters;

public class MetodosAcceso {

	private String nombre;
	private int edad;

	public MetodosAcceso() {
	}

	private void imprimir() {
		System.out.println("Método privado imprimir() llamado desde método público callToPrivateMethod(). ");
	}

	// Métodos de ámbito público que permiten el acceso a los atributos/métodos
	// privados definidos.
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void callToPrivateMethod() {
		imprimir();
	}

}
