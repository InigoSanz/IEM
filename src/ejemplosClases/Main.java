package ejemplosClases;

/**
 * Clase Main.
 */
public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.color = "Rojo";
		System.out.println("El color del coche es: " + car.color);
		System.out.println("La matricula del coche es: " + car.registration);
		System.out.println("¿Es nuevo el coche?: " + car.isNew);
		
		Car car1 = new Car();
		car1.color = "Verde";
		System.out.println("\nEl color del coche 1 es: " + car1.color);
		
		Car car2 = new Car();
		car2.color = "Negro";
		System.out.println("\nEl color del coche 2 es: " + car2.color);
		
		Car car3 = new Car();
		car3.color = "Blanco";
		System.out.println("\nEl color del coche 3 es: " + car3.color);
		car3.isNew = true;
		System.out.println("¿El coche 3 es nuevo?: " + car3.isNew);
		car3.registration = 0;
		car3.setRegistration(900);
		System.out.println("La matricula del coche 3 es: " + car3.registration);
		
		Bike bici = new Bike();
		
	}
}