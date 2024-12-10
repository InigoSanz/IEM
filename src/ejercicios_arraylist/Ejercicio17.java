package ejercicios_arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(0, 100));
		}
		
		numbers.isEmpty();
		
		if (numbers.isEmpty() == true) {
			System.out.println("Esta vacio.");
		} else {
			System.out.println("No esta vacio.");
		}	
	}
}