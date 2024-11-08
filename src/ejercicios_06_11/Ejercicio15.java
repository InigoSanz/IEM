package ejercicios_06_11;

/**
 * Calcular el total de una factura a partir de la base imponible. Indicar además del coste total, el valor del iva. 
 * La base imponible es de 12.10€ y el iva es del 21%.
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		
		// La base imponible en una factura es la cantidad sobre la que se deben calcular los impuestos.
		double taxBase = 12.10;
		final int vat = 21;
		final double VAT_PERCENTAGE = vat / 100.0;
		
		double amountVatPrice = (taxBase * VAT_PERCENTAGE);
		double finalPrice = amountVatPrice + taxBase;
		
		System.out.printf("El precio sin impuestos del producto es %.2f €.\n", taxBase);
		System.out.printf("Si aplicamos el %d %% de IVA (%.2f), nos queda un producto de %.2f €.", vat, amountVatPrice, finalPrice);
		
	}

}