package ejemplo_aplicativo1;

import java.util.Scanner;

/**
 * 
 * Un banco tiene 3 clientes que pueden realizar depositos y retiradas. El banco
 * quiere que al final del día se calcule la cantidad de dinero que hay
 * depositada.
 * 
 * @author josem
 *
 */
public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco();




		Scanner sc = new Scanner(System.in);
		System.out.println(
				"--------------------------\nBINVENIDO AL BANCO\n--------------------------\nPor favor ingrese su número de cuenta: ");
		int cuenta = sc.nextInt();

		String opcion;
		switch (cuenta) {
		case 1:
			System.out.println("Hola " + banco.per1.getNombre());
			System.out.println("Indique la operación a realizar:\nA - Depositar\nB - Retirar");
			opcion = sc.next();
			switch (opcion) {
			case "A":
					System.out.println("Ingrese la cantidad a depositar:");
					double montoEntrada = sc.nextDouble();
					double montoAnteriorDeposito = banco.per1.getMonto();
					banco.per1.setMonto(montoAnteriorDeposito + montoEntrada); 
					System.out.println("Monto final es " + banco.per1.getMonto());
				break;
			case "B":
				System.out.println("Ingrese la cantidad a retirar:");
				double montoRetirada = sc.nextDouble();
				double montoAnteriorRetirada = banco.per1.getMonto();
				banco.per1.setMonto(montoAnteriorRetirada - montoRetirada); 
				System.out.println("Monto final es " + banco.per1.getMonto());
				
				break;
			default:
				break;
			}
			break;

		case 2:
			System.out.println("Hola " + banco.per2.getNombre());
			System.out.println("Indique la operación a realizar:\nA - Depositar\nB - Retirar");
			opcion = sc.next();
			switch (opcion) {
			case "A":
					System.out.println("Ingrese la cantidad a depositar:");
					double montoEntrada = sc.nextDouble();
					double montoAnteriorDeposito = banco.per2.getMonto();
					banco.per2.setMonto(montoAnteriorDeposito + montoEntrada); 
					System.out.println("Monto final es " + banco.per2.getMonto());
				break;
			case "B":
				System.out.println("Ingrese la cantidad a retirar:");
				double montoRetirada = sc.nextDouble();
				double montoAnteriorRetirada = banco.per2.getMonto();
				banco.per2.setMonto(montoAnteriorRetirada - montoRetirada); 
				System.out.println("Monto final es " + banco.per2.getMonto());
				
				break;
			default:
				break;
			}
			break;

		case 3:
			System.out.println("Hola " + banco.per3.getNombre());
			System.out.println("Indique la operación a realizar:\nA - Depositar\nB - Retirar");
			opcion = sc.next();
			switch (opcion) {
			case "A":
					System.out.println("Ingrese la cantidad a depositar:");
					double montoEntrada = sc.nextDouble();
					double montoAnteriorDeposito = banco.per3.getMonto();
					banco.per3.setMonto(montoAnteriorDeposito + montoEntrada); 
					System.out.println("Su monto final es: " + banco.per3.getMonto());
				break;
			case "B":
				System.out.println("Ingrese la cantidad a retirar:");
				double montoRetirada = sc.nextDouble();
				double montoAnteriorRetirada = banco.per3.getMonto();
				banco.per3.setMonto(montoAnteriorRetirada - montoRetirada); 
				System.out.println("Su monto final es: " + banco.per3.getMonto());
				
				break;
			default:
				break;
			}
			break;

		default:
			System.out.println("Denegado - Cuenta no registrada");
			System.exit(0);
			break;
		}

		sc.close();
		System.out.println("--------------------------------\nTotal en Banco: ");
		System.out.println(banco.per1.getMonto() + banco.per2.getMonto() + banco.per3.getMonto());
	}

}
