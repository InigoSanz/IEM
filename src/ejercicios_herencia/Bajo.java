package ejercicios_herencia;

public class Bajo extends Instrumento {
	
	public String material;
	public double weight;
	
	public Bajo(int nRopes) {
		super(nRopes);
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	String sonido() {
		
		return "¡Bwaaaamn!";
	}
}