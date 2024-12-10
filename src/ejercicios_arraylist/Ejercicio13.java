package ejercicios_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(0, 100));
		}
		
		System.out.println("Array sin ordenar: " + numbers);
		
		Collections.sort(numbers);
		
		System.out.println("Array ordenado: " + numbers);
	}
}