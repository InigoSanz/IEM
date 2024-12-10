package ejercicios_herencia;

public class Main {

	public static void main(String[] args) {
		
		Violin violin = new Violin(4);
		Guitarra guitarra = new Guitarra(6);
		Bajo bajo = new Bajo(4);
		
		violin.setnRopes(8);
		violin.setBrand("NI IDEA");
		
		
		guitarra.setMaterial("Saúco");
		guitarra.setWeight(3.2);
		bajo.setnRopes(19);
		
		int nRopesViolin = violin.getnRopes();
		
		System.out.printf("El violin tiene %d cuerdas y es de la marca %s\n\n", nRopesViolin, violin.getBrand());
		
		System.out.printf("Muestra de la guitarra:\n%s", guitarra);
		
		guitarra.afinar();
		
		System.out.printf("\n\nEl sonido que hace un violin es: %s", violin.sonido());
		
	}
}