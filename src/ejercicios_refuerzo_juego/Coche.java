package ejercicios_refuerzo_juego;

import java.util.Random;

public class Coche extends VehiculoPadre implements InterfazVehiculo {
	
	private final int UNIDADES = 5;
	private final int UNIDADES_AUMENTO = 3;
	
	public Coche(String nombre) {
		super(nombre);
	}

	@Override
	public void acelerar() {
		Random random = new Random();
			
		int nRandom = random.nextInt(5, 16);
		setDistanciaRecorrida(getDistanciaRecorrida() + nRandom);
		setCombustible(getCombustible() - UNIDADES);
			
		System.out.println("Se ha acelerado " + nRandom + " km/h y se ha consumido " + UNIDADES + " de combustible, restante " + getCombustible());
		System.out.println("Distancia recorrida: " + getDistanciaRecorrida());
	}

	@Override
	public void frenar() {
		setDistanciaRecorrida(getDistanciaRecorrida() - 5);
		setCombustible(getCombustible() + 3);
		
		System.out.println("Se ha frenado, distancia recorrida " + getDistanciaRecorrida() + " aumento de combustible en " + UNIDADES_AUMENTO + " restante " + getCombustible());
	}
}