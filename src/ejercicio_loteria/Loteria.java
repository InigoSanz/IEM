package ejercicio_loteria;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Inigo
 * @version 1.0
 * 
 * Ejercicio lotería.
 * 
 * Hace cosas...
 */
public class Loteria {

	public static void main(String[] args) throws NumeroLoteriaInvalidoException {
		
		final int PRECIO_DECIMO = 20;
		final int GANANCIA_POR_DECIMO = 40000;
		int dineroGastado = 0;
		int anios = 3000;
		int premio, premio2, premio3 = 0;
		ArrayList<Integer> premio4 = new ArrayList<>();
		ArrayList<Integer> premio5 = new ArrayList<>();

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¡Bienvenidos al juego de loterías y apuestas de estado!\n");
		System.out.printf("Introduce el número de lotería que quieres: ");
		
		int numeroLoteria = scanner.nextInt();
		
		System.out.printf("Introduce el número de décimos que tienes (1-10): ");
		
		int nDecimos;		
		
		if (numeroLoteria < 10000 || numeroLoteria > 99999) {
			excepcionFuera(numeroLoteria);
		}
		
		do {
            nDecimos = scanner.nextInt();
            
            if (nDecimos < 1 || nDecimos > 10) {
            	System.out.printf("Por favor, tiene que ser entre 1 y 10 décimos, prueba otra vez: ");
            }
		} while (nDecimos < 1 || nDecimos > 10);
		
		scanner.close();
	
		boolean hasGanado = false;
		int contador = 0;
		
		for (int i = 1; i < anios; i++) {			
			dineroGastado += nDecimos * PRECIO_DECIMO;
			
			premio = generateRandomNumber();
			premio2 = generateRandomNumber();
			premio3 = generateRandomNumber();
			
			// 
			for (int j = 0; j < 2; j++) {
				premio4.add(generateRandomNumber());
			}
			
			for (int j = 0; j < 8; j++) {
				premio5.add(generateRandomNumber());
			}
			
			int dineroGanado = nDecimos * GANANCIA_POR_DECIMO;
			
			contador++;
			
			if (numeroLoteria == premio || numeroLoteria == premio2 || numeroLoteria == premio3 
					|| premio4.contains(numeroLoteria) || premio5.contains(numeroLoteria)) {
				System.out.printf("¡Enhorabuena, has ganado %d euros con tu número %d!\n", dineroGanado, numeroLoteria);
				System.out.printf("Ten en cuenta que te has gastado %d euros en %d años.\n", dineroGastado, contador);
				hasGanado = true;
				break;
			}	
		}
		
		if (!hasGanado) {
			System.err.println("¡No has ganado en 10 años y te has gastado " + dineroGastado + " euros!");
		}
	}
	
	/*
	 * Private, ya que solo lo vamos a utilizar en esta clase.
	 * Saco el lanzamiento de la excepción fuera.
	 * Ya que para un correcto orden de ejecucion, tenia que cerrar el scanner despues (CREO).
	 * Esto es por haber utilizado un do while para que siga pidiendo el número de décimos (CREO).
	 */
	private static void excepcionFuera(int numeroLoteria) throws NumeroLoteriaInvalidoException {
		throw new NumeroLoteriaInvalidoException("El número de loteria " + numeroLoteria + " es inválido.");
	}
	
	/*
	 * Private, ya que solo lo vamos a utilizar en esta clase.
	 * Genera un número aleatorio para la lotería.
	 */
	private static int generateRandomNumber() {
		Random random = new Random();
		
		return random.nextInt(10000, 100000);
	}
}