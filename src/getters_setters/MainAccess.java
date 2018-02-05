package getters_setters;

public class MainAccess {

	public static void main(String[] args) {
		
		MetodosAcceso acceso = new MetodosAcceso();
		
		acceso.setNombre("Juan");
		acceso.setEdad(22);
		
		acceso.callToPrivateMethod();
		
		System.out.println("Tu nombre es " + acceso.getNombre() + " y tienes " + acceso.getEdad() + " años");
		
		
	}

}
