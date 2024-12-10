package ejercicios_clases_estaticas;

/**
 * Calculo del exponente
 */
public class Main {

	public static void main(String[] args) {
		int varSuma;
		int varResta;
		int varMulti;
		double varDiv;
		double varExpo;
		
		varSuma = CalculadoraStatic.suma(5, 5);
		varResta = CalculadoraStatic.resta(4, 2);
		varMulti = CalculadoraStatic.multiplicacion(5, 5);
		varDiv = CalculadoraStatic.division(4, 3);
		varExpo = CalculadoraStatic.exponente(8, 6);
		
		System.out.println("Los resultados son: ");
		System.out.printf("Suma: %d\n", varSuma);
		System.out.printf("Resta: %d\n", varResta);
		System.out.printf("Multiplicación: %d\n", varMulti);
		System.out.printf("División: %.2f\n", varDiv);
		System.out.printf("Exponente: %.2f", varExpo);
	}
}