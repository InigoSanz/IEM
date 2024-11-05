package primeros_ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int years = 5;
		int weeks = 52;
		int days = 7;
		int extraDaysPerYear = 1; //si cae bisiesto 2
		
		int fiveYearDays = (weeks * days) * years + (years * extraDaysPerYear);
		
		System.out.println(fiveYearDays + " días en 5 años.");
	}

}
