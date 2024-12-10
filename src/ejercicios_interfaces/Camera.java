package ejercicios_interfaces;

public class Camera implements FotografiableInterfaz{
	
	private String brand;
	private double weight;
	private String color;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void takePhoto() {	
		System.out.println("Has echado una foto.");	
	}

	@Override
	public void deletePhoto() {
		System.out.println("Has eliminado una foto.");
	}
}