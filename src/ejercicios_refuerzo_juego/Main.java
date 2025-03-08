package ejercicios_refuerzo_juego;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vehículos disponible:");
		System.out.println("1) Coche");
		System.out.println("2) Bicicleta");
		System.out.println("3) Motocicleta");
		System.out.print("Selección: ");
			
		int opcion = scanner.nextInt();
		scanner.nextLine();
		
		Motocicleta motoContrincante = new Motocicleta("Moto Super Rápida");
		VehiculoPadre seleccion = null;
		
		switch (opcion) {
		case 1:
			seleccion = new Coche("Batmóvil");
			break;
		case 2:
			seleccion = new Bicicleta("Bici Súper Rápida");
			break;
		case 3:
			seleccion = new Motocicleta("Motocluster");
			break;
		default:
			System.err.println("Opción no válida, reinicia el programa.");
			break;	
		}
		
		System.out.println("\nEmpieza el juego con tu " + seleccion.getNombre());
		
		boolean fin = false;
		
		while (fin == false) {
			System.out.println("\nAcción:");
			System.out.println("1) Acelerar");
			System.out.println("2) Frenar");
			System.out.print("Selecciona tu acción: ");
			
			int accion = scanner.nextInt();
			
			if (accion == 1) {
				((InterfazVehiculo) seleccion).acelerar(); // Si no casteo no puedo acceder a los métodos acelerar y frenar
			} else {
				((InterfazVehiculo) seleccion).frenar();
			}
			
			System.out.println("\nTurno del contrincante: ");
			motoContrincante.acelerarFrenar();
			
			/*
			 * Aquí me encontré con un problema:
			 * En el coche en cada turno si solo acelero, se le va restando 5 de combustible
			 * Entonces en la comprobación, a pesar de haber llegado a 100 kilometros recorridos, como primero
			 * Estaba el comprobar combustible, ganaba la moto en vez de en este caso el coche.
			 */
			if ((seleccion.getCombustible() == 0 || seleccion.getCombustible() < 0) && motoContrincante.getCombustible() > 0) {
				System.out.println("Gana " + motoContrincante.getNombre());
				fin = true;
				break;
			} else if (seleccion.getCombustible() > 0 && (motoContrincante.getCombustible() == 0 || motoContrincante.getCombustible() < 0)) {
				System.out.println("Gana " + seleccion.getNombre());
				fin = true;
				break;
			} else if ((seleccion.getCombustible() == 0 || seleccion.getCombustible() < 0) && (motoContrincante.getCombustible() == 0 || motoContrincante.getCombustible() < 0)) {
				System.out.println("Empate entre " + seleccion.getNombre() + " y " + motoContrincante);
				fin = true;
				break;
			}
			
			if (seleccion.getDistanciaRecorrida() < 100 && (motoContrincante.getDistanciaRecorrida() == 100 || motoContrincante.getDistanciaRecorrida() > 100)) {
				System.out.println("Gana " + motoContrincante.getNombre() + ", distancia recorrida:" + motoContrincante.getCombustible());
				fin = true;
				break;
			} else if ((seleccion.getDistanciaRecorrida() == 100 || seleccion.getDistanciaRecorrida() > 100) && motoContrincante.getDistanciaRecorrida() < 100) {
				System.out.println("Gana " + seleccion.getNombre() + ", distancia recorrida: " + seleccion.getDistanciaRecorrida());
				fin = true;
				break;
			} else if ((seleccion.getDistanciaRecorrida() == 100 || seleccion.getDistanciaRecorrida() > 100) && (motoContrincante.getDistanciaRecorrida() == 100 || motoContrincante.getDistanciaRecorrida() > 100)) {
				System.out.println("Hay un empate entre " + seleccion.getNombre() + " y " + motoContrincante.getNombre() + ", ambos han recorrido " + seleccion.getDistanciaRecorrida());
				fin = true;
				break;
			}
		}
	System.out.println("\n¡Juego terminado!");
	scanner.close();	
	}
}