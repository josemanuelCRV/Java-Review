package ejemplo_aplicativo1;

public class Banco {

	// Clientes
	Persona per1 = new Persona();
	Persona per2 = new Persona();
	Persona per3 = new Persona();

	public Banco() {
		// Datos por default
		per1.setCuenta(1);
		per1.setNombre("Jose");
		per1.setMonto(1000);

		per2.setCuenta(2);
		per2.setNombre("David");
		per2.setMonto(1000);

		per3.setCuenta(3);
		per3.setNombre("Pedro");
		per3.setMonto(1000);
	}

	public Persona getPer1() {
		return per1;
	}

	public Persona getPer2() {
		return per2;
	}

	public Persona getPer3() {
		return per3;
	}

	public void setPer1(Persona per1) {
		this.per1 = per1;
	}

	public void setPer2(Persona per2) {
		this.per2 = per2;
	}

	public void setPer3(Persona per3) {
		this.per3 = per3;
	}

}
