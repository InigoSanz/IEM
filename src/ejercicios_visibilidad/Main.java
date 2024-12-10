package ejercicios_visibilidad;

public class Main {

	public static void main(String[] args) {
		
		int limit = 10;
		int totalSum = 10;
		int i = 0;
		while(i <= limit) {
			totalSum -= i;
			System.out.println("Para " + i + " sumatorio: " + totalSum);
			i++;
		}
		System.out.println("I: " + i);
		System.out.println("Sumatorio total: " + totalSum);

	}

}
