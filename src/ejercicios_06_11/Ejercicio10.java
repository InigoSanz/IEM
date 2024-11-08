package ejercicios_06_11;

import java.util.Scanner;

/**
 * Tenemos un producto cuyo precio es de 120€.
 * Realizar un programa que realice los siguientes cálculos:
 * - Introduciento un % de descuento calcule el precio final a aplicar al cliente.
 * - Saber el importe en euros que se le ha descontado al cliente.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		
		int price = 120;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce la cantidad de descuento: ");
		
		int discountValue = scanner.nextInt();
		
		scanner.close();
		
		double percentage = discountValue / 100.0;		
		double finalDiscount = price * percentage;	
		double finalPrice = price - finalDiscount;
			
		System.out.printf("El producto con el %d%% de descuento vale %.2f €.\n", discountValue, finalPrice);
		
		double discountPrice = price - finalPrice;
		
		System.out.printf("El descuento del producto ha sido de %.2f €.", discountPrice);
	}
}