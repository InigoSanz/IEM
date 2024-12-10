package ejercicios_clases_abstractas;

public class Loro extends Animales {
	
	public Loro(String raza, String nombre, String color) {
		super(raza, nombre, color);
	}
	
	@Override
	int nPata() {
		// TODO Auto-generated method stub
		return 2;
	}
}