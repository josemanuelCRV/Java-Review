package tuto4_Abstractas_Polimorfismo;

public class MainPersonajes {

	public static void main(String[] args) {
		
//		Goku goku = new Goku("Goku 1", "img1", 5, 5, "sonGoan", true);
//		
//		System.out.println(goku.toString());	
//		goku.moverX();
//		System.out.println("Nueva posición X: " + goku.posX);
//		System.out.println(goku.saludar());
//		
//		
//		
//		Pokemon pokemon = new Pokemon("Ra", "img2", 30, 30, "rojo");
//		
//		System.out.println(pokemon.toString());	
//		pokemon.moverX();
//		System.out.println("Nueva posición X: " + pokemon.posX);
//		System.out.println(pokemon.saludar()+ "y soy un Pokemon");
		
		
		
		// Polimorfismo --> 
		// Matrices Polimorficas son que dentro de una matriz pueden ser de
		// diferentes tipos pero todas deben tener algo en común. Son Personaje´s
		// Creamos 4 referencias de tipo Personaje. No estamos creando objetos
		Personaje personajes[] = new Personaje[4];
		personajes[0] = new Pokemon("Pikachu","imag3",50,25,"verde");
		personajes[1] = new Goku("Crilin", "img4", 80, 55, "aplliCrilin", true);
		personajes[2] = new Pokemon("Pokemon2", "img66", 7, 8, "azul"); 
		personajes[3] = new Goku("Jose", "imgJose", 90, 200, "Calvo", true);
 		
		for(int i = 0; i < personajes.length; i++){
			
			System.out.println("--------\n" + personajes[i].toString() + "\n" + personajes[i].saludar());
		}
		
		// Creamos 1 referencia polimorfica de tipo Personaje que será a su vez de tipo 
		// personaje goku, porque Goku es tambien un Personaje y con más funciones
		Personaje refPoli = new Goku("Bulma", "imgBulma", 100, 100, "sñ.goku", true);		
		System.out.println("\n" + refPoli.toString());
		// Un pokemon es un personaje pero no todos los persnonaje son pokemon
		// por eso no podríamos crear: Pokemon refPoli = new Personaje();
	 
		
		// Puedo acceder al metodo despedida() propio de la clase Goku porque creo una 
		// referencia al objeto desde el mismo nivel/tipo  Goku vegeta = new Goku.
		Goku vegeta = new Goku("Vegeta", "img400", 800, 555, "VeSurname", true);
		System.out.println(vegeta.despedida());
		
		// Por eso desde el nivel personaje 
		// NO puedo acceder a al metodo despedida(), y si a saludar
		Personaje  cris = new Goku("Juan", "imgJose", 90, 200, "Calvo", true);
		System.out.println(cris.saludar());
		//((Goku) personajes[0]).despedida();
		
		System.out.println(personajes[1].nombre + "\n" + personajes[1].saludar() );
		
		// a estos metodos tenemos acceso desde el nivel Personaje
//		 System.out.println( personajes[1].imagen, personajes[1].nombre,
//				 personajes[1].posX,
//				 personajes[1].posY,
//				 personajes[1].moverX(),
//				 personajes[1].moverY(),
//				 personajes[1].saludar()
//				 
//				 );
		
		 
			// Esta es la forma de acceder a los metodos no sobrescritos propios de la clase Goku.
			// casteando con un molde la referencia de personaje.
			// Le decimos que personajeDummy que originalmente es de tipo Personaje y Goku
			// que no se quede sólo con los metodos de Personaje sobrescritos en Goku
			// sino que personajeDummy acceda con el casteo al mismo nivel que Goku
			// Para así poder entrar a los propios métodos de Goku aparte de los sobrescritos
		
		Personaje personajeDummy = new Goku("LUis", "imgLuis", 2090, 500, "Alvarez", false);
		((Goku) personajeDummy).despedida();

		
			System.out.println( "\n" + ((Goku) personajeDummy).despedida() + "\n" + personajeDummy.saludar());
		 
		 
	}

}
