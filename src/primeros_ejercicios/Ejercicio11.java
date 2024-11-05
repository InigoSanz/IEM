package primeros_ejercicios;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7; // veces que se va al programa
		final int nMin = 10; // numero de veces minimo que hay que ir
		
		if (n >= nMin) {
			System.out.println("Es platino.");
		} else {
			System.out.println("No es platino.");
		}
		
		//Con boolean seria
		boolean isPlatinum = n >= nMin;
		
		System.out.println(isPlatinum);
		
	}

}
