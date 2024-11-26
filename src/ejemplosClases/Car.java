package ejemplosClases;

/**
 * Clase de ejemplo de un coche.
 */
public class Car {

	public String color;
	public int registration;
	public boolean isNew; 
	
	public int setRegistration(int newRegistration) {
		
		if (newRegistration >= 1000 && newRegistration <= 9999) {
			
			registration = newRegistration;		
			return newRegistration;			
		} 
		
		return registration;		
	}
}