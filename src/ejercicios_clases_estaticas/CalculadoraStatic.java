package ejercicios_clases_estaticas;

public class CalculadoraStatic {
	
	public static int suma(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int resta(int n1, int n2) {
		return n1 - n2;
	}
	
	public static int multiplicacion(int n1, int n2) {
		return n1 * n2;
	}
	
	public static double division(int n1, int n2) {
		return (double) n1 / (double) n2;
	}
	
	public static double exponente(int n1, int n2) {
		return (double) Math.pow(n1, n2);
	}
}
