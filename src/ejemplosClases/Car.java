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
	
	public Car(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
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
		
		if (!(object instanceof Car)) {
			return false;
		}
		
		Car c = (Car) object;
		
		if (c.marca == null) {
			return false;
		}
		
		boolean registrationIsTrue = c.marca.equals(marca);
		
		return registrationIsTrue;	
	}
	
	@Override
	public String toString() {
		
		return "El coche es de la marca " + this.marca + "\n" +
		"EL modelo es el " + this.modelo + "\n" +
				"Y también añadir que es de color " + this.color;
	}
	
	
	
	
	
	
	
	
}