package ejercicios_herencia;

public class Guitarra extends Instrumento implements EstaAfinado {
	
	public String material;
	public double weight;
	
	public Guitarra(int nRopes) {
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
	
	public String toString() {
		return "La guitarra esta hecha de " + this.material + "\n" + 
				"Tiene " + this.nRopes + " cuerdas\n" + 
				"Pesa " + this.weight + "\n";
	}

	@Override
	public void afinar() {	
		System.out.printf("La guitarra esta afinada.");	
	}

	@Override
	String sonido() {
		
		return "¡Bwiuumn!";
	}
}