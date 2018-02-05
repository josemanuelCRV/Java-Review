package metodos_instancia_y_clase;

public class Persona {

	private String nombre;
	private int edad;

	
	
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
	
	public void mostrarDeInstancia(){
		System.out.println(this.nombre + ", " + this.edad);
	}
	
	public static void mostrarDeClase(){
		System.out.println("M�todo est�tico");
	}

}
