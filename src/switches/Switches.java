package switches;

import java.util.Scanner;

public class Switches {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce alguna de estas dos cadenas: hola | ciao");
		String input = sc.nextLine();

		switch (input) {
		case "hola":
			System.out.println("Hola!!! Bienvenido");
			break;

		case "ciao":
			System.out.println("Hasta pronto :´( ");
			break;

		default:
			System.out.println("=) quizá en otra ocasión");
			break;
		}
		
		sc.close();

	}

}
