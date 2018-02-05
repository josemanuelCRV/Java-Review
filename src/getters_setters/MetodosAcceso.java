package getters_setters;

public class MetodosAcceso {

	private String nombre;
	private int edad;

	public MetodosAcceso() {
	}

	private void imprimir() {
		System.out.println("M�todo privado imprimir() llamado desde m�todo p�blico callToPrivateMethod(). ");
	}

	// M�todos de �mbito p�blico que permiten el acceso a los atributos/m�todos
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
