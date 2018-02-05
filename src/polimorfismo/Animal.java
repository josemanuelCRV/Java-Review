package polimorfismo;

/***
 * 
 * Palabra reservada Abstrac. Indica que al ser una clase es abstracta, no es
 * posible hacer una instancia directamente de esta clase. Animal a = new
 * Animal().
 * 
 * Como ventajas, además de evitar que se pueda instanciar esta clase
 * directamente, vamos a poder crear métodos también abstractos, los cuales NO
 * pueden ser implementados en esta clase. Deben ser implementados en las clases
 * que hereden de esta. Los métodos abstractos no pueden ser implementados por
 * la clase mayor, sino por las clases hijas.
 * 
 *
 */
public abstract class Animal {

	private String tipo;
	private float peso;
	private String tipo_alimentacion;

	public Animal(String tipo, float peso, String tipo_alimentacion) {
		super();
		this.tipo = tipo;
		this.peso = peso;
		this.tipo_alimentacion = tipo_alimentacion;
	}

	public Animal() {

	}

	// Este método abstracto, debe ser implementado por las clase que hereden de
	// esta. Permitiendo así comportarse de forma diferente, en función al
	// objeto o
	// a la instancia con los que se creen (Macaco-Cachorro).
	//
	// De esta forma, se crea el polimorfismo, donde tomará diferentes
	// formas/comportamiento en función al tipo de Alimentación:
	// Carnivoros-Obnivoros
	public abstract void alimentarse();

	public void moverse() {
		System.out.println("El animal se está moviendo...");
	}

	public String getTipo() {
		return tipo;
	}

	public float getPeso() {
		return peso;
	}

	public String getTipo_alimentacion() {
		return tipo_alimentacion;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setTipo_alimentacion(String tipo_alimentacion) {
		this.tipo_alimentacion = tipo_alimentacion;
	}

}
