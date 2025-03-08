package ejercicios_refuerzo_juego;

import java.util.Random;

/**
 * Clase Bicicleta.
 */
public class Bicicleta extends VehiculoPadre implements InterfazVehiculo {
	
	// Constantes
	private final int UNIDADES = 3;
	private final int UNIDADES_AUMENTO = 3;
	
	// Constructor
	public Bicicleta(String nombre) {
		super(nombre);
	}

	@Override
	public void acelerar() {
		Random random = new Random();

		int nRandom = random.nextInt(3, 9);
		setDistanciaRecorrida(getDistanciaRecorrida() + nRandom);
		setCombustible(getCombustible() - UNIDADES);
		
		System.out.println(getNombre() + ": ");
		System.out.println("Se ha acelerado " + nRandom + " km/h y se ha consumido " + UNIDADES
				+ " L de combustible, restante " + getCombustible() + " L");
		System.out.println("Distancia recorrida: " + getDistanciaRecorrida() + " Kms");
	}

	@Override
	public void frenar() {
		setDistanciaRecorrida(getDistanciaRecorrida() - 5);
		setCombustible(getCombustible() + 3);
		
		System.out.println(getNombre() + ": ");
		System.out.println("Se ha frenado, distancia recorrida " + getDistanciaRecorrida()
				+ " Kms, aumento de combustible en " + UNIDADES_AUMENTO + " L, restante " + getCombustible() + " L");
	}
}