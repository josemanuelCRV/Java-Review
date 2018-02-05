package modificadores_de_acceso;

/**
 * Los modificadores de acceso son el ambito o alcance que tienen los atributos
 * o métodos durante toda la aplicación.Es decir, determina la visibilidad y
 * acceso a los atributos y métodos.
 * 
 * Ambito: 
 * ---------
 * 
 * private --- Acceso solo desde la clase donde estén definidos.
 * 
 * public --- Acceso por cualquier clase de la aplicación.
 * 
 * protected --- Acceso sólo por clases que se encuentren dentro del paquete.
 */
	
public class MainConstructor {

	public static void main(String... args) {
		
		ModifcicadoresAcceso mod = new ModifcicadoresAcceso();
		System.out.println("Ámbito\nPublic: " +  mod.eded  + "\nProtected: " +  mod.ciudad + "\nPackage: " +  mod.movil );
	}

}
