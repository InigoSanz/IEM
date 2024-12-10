package ejercicios_herencia;

public class Violin extends Instrumento {
	
	public String brand;
	public boolean isTuned;
	
	public Violin(int nRopes) {
		super(nRopes);
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public boolean isTuned() {
		return isTuned;
	}
	
	public void setTuned(boolean isTuned) {
		this.isTuned = isTuned;
	}

	@Override
	String sonido() {
		
		return "¡Miiiun!";
	}
}