package herencia;

public class Mamiferos extends Vertebrados {

	private int tiempoLactancia;
	private String habitat;

	public Mamiferos(String nombre, String alimentacion, int edad, String esqueleto, String reproduccion,
			String tempSangre, int tiempoLactancia, String habitat) {
		super(nombre, alimentacion, edad, esqueleto, reproduccion, tempSangre);
		this.tiempoLactancia = tiempoLactancia;
		this.habitat = habitat;
	}

	public int getTiempoLactancia() {
		return tiempoLactancia;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setTiempoLactancia(int tiempoLactancia) {
		this.tiempoLactancia = tiempoLactancia;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

}
