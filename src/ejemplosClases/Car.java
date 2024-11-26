package ejemplosClases;

/**
 * Clase de ejemplo de un coche.
 */
public class Car {

	public String color;
	public int registration;
	public boolean isNew; 
	public String marca;
	public String modelo;
	
	public Car() {
		
	}
	
	public Car(int registration) {
		this.registration = registration;
	}
	
	public Car(String marca, String modelo, int registration) {
		this.marca = marca;
		this.modelo = modelo;
		this.registration = registration;
	}
	
	public int setRegistration(int newRegistration) {
		
		if (newRegistration >= 1000 && newRegistration <= 9999) {
			
			registration = newRegistration;		
			return newRegistration;			
		} 
		
		return registration;		
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public boolean equals(Object object) {
		
		Car c = (Car) object;
		
		boolean registrationIsTrue = c.registration == registration;
		
		return registrationIsTrue;	
	}
	
	
	
	
	
	
	
	
	
	
	
}