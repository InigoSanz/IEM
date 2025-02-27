package ejercicios_refuerzo;

public class Main {

	public static void main(String[] args) {
		
		Airplane a1 = new Airplane("Boeing", "737");
		Airplane a2 = new Airplane("Airbus", "380");
		Airplane a3 = new Airplane(400);
		Airplane a4 = new Airplane("Airbus", "380");
		
		boolean sonIguales = Airplane.sonIguales(a1, a4);
		
		System.out.println("¿Son iguales el avion 1 y el 4? " + (sonIguales ? "Sí" : "No"));
	}
}