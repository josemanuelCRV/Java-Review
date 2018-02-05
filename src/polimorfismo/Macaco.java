package polimorfismo;

public class Macaco extends Animal {

	private String nombre;

	public Macaco(String tipo, float peso, String tipo_alimentacion, String nombre) {
		super(tipo, peso, tipo_alimentacion);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void alimentarse() {
		System.out.println("Soy un " + getClass().getSimpleName() + " y me Alimento de Frutas");
		
	}

}
