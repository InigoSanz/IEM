package ejercicios_clases_abstractas;

public class Gato extends Animales {
	
	public Gato(String raza, String nombre, String color) {
		super(raza, nombre, color);
	}
	
	@Override
	int nPata() {
		// TODO Auto-generated method stub
		return 4;
	}
}