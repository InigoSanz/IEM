package ejercicios_clases_abstractas;

public class Perro extends Animales {
	
	public Perro(String raza, String nombre, String color) {
		super(raza, nombre, color);	
	}
	
	@Override
	int nPata() {
		// TODO Auto-generated method stub
		return 4;
	}
}