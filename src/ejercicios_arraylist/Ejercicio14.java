package ejercicios_arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 * Crear un ArrayList aleatorio de números.
 * Realizar una copia de este y modficarlo.
 * Usando el método y el contructor.
 * ¿Se ha modificado el original?
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(0, 100));
		}
		
		ArrayList<Integer> copia1 = new ArrayList<>(numbers);
		
		ArrayList<Integer> copia2 = new ArrayList<>();
		copia2.addAll(numbers);
		
		System.out.println(numbers);
		System.out.println(copia1);
		System.out.println(copia2);
	}
}