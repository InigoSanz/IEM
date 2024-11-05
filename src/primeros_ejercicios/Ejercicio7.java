package primeros_ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double farenheitDegrees = 90;
		double celsiusDegrees = ((farenheitDegrees - 32) * 5) / 9;
		
		System.out.printf("%.2f grados farenheit son %.2f grados celsius.", farenheitDegrees, celsiusDegrees);
	}

}