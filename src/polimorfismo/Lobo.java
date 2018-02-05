package polimorfismo;

public class Lobo extends Animal {

	private String apellido;

	public Lobo(String tipo, float peso, String tipo_alimentacion, String apellido) {
		super(tipo, peso, tipo_alimentacion);
		this.apellido = apellido;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public void alimentarse() {
		System.out.println("Soy un " + getClass().getSimpleName() + " y me alimento de Carne");
		
	}

}
