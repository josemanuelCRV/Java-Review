package tuto5_Interfaces_ListasDinamicas;

interface Acciones {

	// de forma implicita van a ser:
	// todos los metodos Publicos y Abstractos van a tener que ser sobrescritos
	// 
	// todos las variables de forma implicita van a ser publicas staticas y finales
	// porque si ponemos static tenemos necesariamente que poner public
	// si ponemos STATIC significa que podremos acceder a ellas sin crear un objeto
	// FINAL es que hacemos constantes
	
	// ¿Un metodo abstracto puede llevar el modificador static?
	// No, porque nostros no podemos acceder a un metodo abstracto sin crear objetos 
	// porque ese metodo abstracto no está implementado, lo unico que está es declarado 
	// para ser implementado obligatoriamente en el objeto hijo q creemos heredado de él
	
	// ¿Un metodo abstracto puede llevar el modificador final delante?
	// No, se contradice, porque un metodo abstracto deben ser sus metodos sobrescritos 
	// obligatoriamente en la clase que extienda de ella, y con fina  lo que estamos 
	// diciendo que NO queremos que sea sobrescrito, sino que sea constante.
	
	// public void setNombre();
	
	// de forma implicita el compilador pone que son public static final
	double velX = 50;
	public static final double velY = 10;
	
	// de forma implicita los metodos son publics y abstract
	void move();
	public abstract void atack();
	
	
	
	
}
