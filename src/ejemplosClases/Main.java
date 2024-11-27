package ejemplosClases;

/**
 * Clase Main.
 */
public class Main {

	public static void main(String[] args) {
		
		Car car = new Car("Audi", "A3", "Blanco");
		
		Car car1 = new Car(9994);
		
		boolean areEquals = car.equals(car1);
		
		System.out.printf("Los coches son iguales: %b", areEquals);
		
		/*
		System.out.println("El color del coche es: " + car.color);
		System.out.println("La matricula del coche es: " + car.registration);
		System.out.println("¿Es nuevo el coche?: " + car.isNew);
		*/
			
		/*
		Car car3 = new Car();
		car3.color = "Blanco";
		car3.setColor("Amarillo galáctico.");
		car3.getColor();
		System.out.println("\nEl color del coche 3 es: " + car3.color);
		car3.isNew = true;
		System.out.println("¿El coche 3 es nuevo?: " + car3.isNew);
		car3.registration = 0;
		car3.setRegistration(900);
		System.out.println("La matricula del coche 3 es: " + car3.registration);
		*/		
	}
}