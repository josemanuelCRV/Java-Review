package herencia;

public class Vertebrados extends Animal {

	private String esqueleto; // oseo | cartilaginoso
	private String reproduccion; // ov�paro | viv�paro
	private String tempSangre;

	// Este constructor vac�o nos permite que la clase que herede de esta, no
	// necesite llamar en su constructor al
	public Vertebrados() {

	}

	// Si el m�todo super() no llama a los atributos de la super-clase de la que
	// hereda �sta, no pasar� los par�metros a la clase subhija
	public Vertebrados(String nombre, String alimentacion, int edad, String esqueleto, String reproduccion,
			String tempSangre) {
		// super();
		super(nombre, tempSangre, edad);
		this.esqueleto = esqueleto;
		this.reproduccion = reproduccion;
		this.tempSangre = tempSangre;
	}

	public String getEsqueleto() {
		return esqueleto;
	}

	public String getReproduccion() {
		return reproduccion;
	}

	public String getTempSangre() {
		return tempSangre;
	}

	public void setEsqueleto(String esqueleto) {
		this.esqueleto = esqueleto;
	}

	public void setReproduccion(String reproduccion) {
		this.reproduccion = reproduccion;
	}

	public void setTemp_sangre(String temp_sangre) {
		this.tempSangre = temp_sangre;
	}

}
