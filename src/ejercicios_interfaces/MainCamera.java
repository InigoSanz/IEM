package ejercicios_interfaces;

public class MainCamera {

	public static void main(String[] args) {
		
		Camera camera = new Camera();
		
		camera.setBrand("Canon");
		camera.setColor("Negro");
		camera.setWeight(1.13);
		
		String marca = camera.getBrand();
		String color = camera.getColor();
		double peso = camera.getWeight();
		
		System.out.printf("La camara es de la marca %s\n", marca);
		System.out.printf("La camara es de color %s\n", color);
		System.out.printf("La camara pesa %.2f Kilos.\n", peso);
		
		camera.takePhoto();
		camera.deletePhoto();

	}
}