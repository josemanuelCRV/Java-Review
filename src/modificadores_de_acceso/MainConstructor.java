package modificadores_de_acceso;

/**
 * Los modificadores de acceso son el ambito o alcance que tienen los atributos
 * o m�todos durante toda la aplicaci�n.Es decir, determina la visibilidad y
 * acceso a los atributos y m�todos.
 * 
 * Ambito: 
 * ---------
 * 
 * private --- Acceso solo desde la clase donde est�n definidos.
 * 
 * public --- Acceso por cualquier clase de la aplicaci�n.
 * 
 * protected --- Acceso s�lo por clases que se encuentren dentro del paquete.
 */
	
public class MainConstructor {

	public static void main(String... args) {
		
		ModifcicadoresAcceso mod = new ModifcicadoresAcceso();
		System.out.println("�mbito\nPublic: " +  mod.eded  + "\nProtected: " +  mod.ciudad + "\nPackage: " +  mod.movil );
	}

}
