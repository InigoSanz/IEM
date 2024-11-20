package ejercicios_20_11_for;

public class EjercicioPrimeroClase {

	public static void main(String[] args) {
		
		// 0123456789
		// 0123456789
		// asi 10 veces
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
			System.out.print(j);
			}
			// Aqui un salto de linea para cuando imprima todos
			System.out.println();
		}
	}
}