package ejercicios_clases_abstractas;

public class Main {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Bengalí", "Simba", "Marrón");
		Perro perro = new Perro("Bulldog", "Edward", "Negro");
		Loro loro = new Loro("Papagayo", "Perico", "Blanco");
		
		System.out.println("Mi gato: " + gato + " y tiene " + gato.nPata() + " patas.");
		System.out.println("Mi perro: " + perro + " y tiene " + perro.nPata() + " patas.");
		System.out.println("Mi loro: " + loro + " y tiene " + loro.nPata() + " patas.");
	}
	
	// Podriamos utilizar esta funcion
	public static int getAnimalsPaws(Animales animales) {
		return animales.nPata();
	}
}