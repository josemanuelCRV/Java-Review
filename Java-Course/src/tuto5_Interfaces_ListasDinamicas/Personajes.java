package tuto5_Interfaces_ListasDinamicas;

public abstract class Personajes implements Acciones{
	
	private String nombre;
	private int posX, posY;
	
	
	public Personajes(String nombre, int posX, int posY) {
		super();
		this.nombre = nombre;
		this.posX = posX;
		this.posY = posY;
	}

	
	// si la clase fuese SIN abstract estaría obligado 
	// a sobrescribir todos los metodos ya  que implenta 
	// la interface Acciones.
	
	// Como hemos puesto abstract me permite que no sean sobrescritos
	// todos los metodos, pero las clases Hijas que hereden de esta
	// SI estarán Obligadas a implementar los metodos que falten 
	// por sobrescribir en la clase de la que extienden
	
	// vease el ejemplo que attack lo quito aquí y no da error,
	// pero la clase Goku que extiende de esta obliga a que 
	// el metodo attack sea sobrescrito en ella.

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

//
//	@Override
//	public void atack() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
	
	
	 

}
