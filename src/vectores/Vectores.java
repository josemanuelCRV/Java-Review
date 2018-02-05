package vectores;

import java.util.Scanner;

public class Vectores {

	public static void main(String[] args) {

		
		/**
		 *  Vectores:
		 *  
		 *   Establecer el tamaño del vector en función del ingreso por teclado.
		 */
		
		System.out.println("Ingrese el tamaño del vector: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		String[] vector = new String [size];
		
		// rellenar el vector con tantos valores como tamaño tenga.
		for(int i = 0; i < vector.length; i++){
			System.out.println("Ingrese un valor para la posición: " + i + " ->");
			vector[i] = sc.next();
			
		}
		
		System.out.println("--------RESULTADO---------");
		
		for(String elemento : vector){
			System.out.println(elemento);
		}
		
		
		
		
		
		
		
		
		
		
		
//		// (uso para cuando no haya que borrar del array, como en arraylinkedlist)
//		// for mejorado. fijo un apodo "s" para cada elemento del :array
//		String[] array = {"juan","pepe","luis"};
//	
//		for(String s : array){
//			System.out.println(s);
//		}
//	
//		// if mejorado. asigno "mayor" al if-mejorado 
//		int x = 10;
//		int y = 20;
//		int mayor;
//		
//		// si condición true, entonces "x", sino ":"  será "y"
//		mayor = (x > y)  ? x : y;
//		System.out.println(mayor);
		
		
		
		
		
		sc.close();
		
		
		

	}

}
