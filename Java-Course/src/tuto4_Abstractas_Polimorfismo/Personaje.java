package tuto4_Abstractas_Polimorfismo;

abstract class Personaje {
	
	// Class Abstract indica un modelo que define de forma más global el objeto.
	// No puede haber objetos de esta clase porque el objeto Personaje principal
	// aquí presente no está definido. Si no que se obliga a que sea definido el 
	// objeto en cada clase donde se herede.
	// mantiene un patron que deben seguir las clases que hereden de esta.
	
	/**
	 * Todos nuestros personajes que hereden de este tendrán OBLIGATORIAMENTE:
	 * nombre, imagen, posX, posY, moverX(), moverY(), saludar().
	 * 
	 */
	
	protected String nombre;
	protected String imagen;
	protected int posX, posY;
	
	
	public Personaje(String nombre, String imagen, int posX, int posY) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
		this.posX = posX;
		this.posY = posY;
	}
	
	// metodos abstractos no tienen el funcionamiento definido.
	// queremos que los metodos sean redefinidos en cada clase que hereda de esta.
	protected abstract void moverX();
	protected abstract void moverY();
	protected abstract String saludar();
	
	@Override
	public abstract String toString();
	
	

}
