package ejercicios_refuerzo_juego;

import java.util.Random;

/**
 * Clase Motocicleta.
 */
public class Motocicleta extends VehiculoPadre implements InterfazVehiculo {
	
	// ConstantesS
	private final int UNIDADES = 7;
	private final int UNIDADES_AUMENTO = 3;
	
	// Atributos
	private Random random;
	
	// Constructor
	public Motocicleta(String nombre) {
		super(nombre);
		this.random = new Random();
	}

	@Override
	public void acelerar() {
		Random random = new Random();

		int nRandom = random.nextInt(8, 21);
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
	
	/**
	 * Como en este juego siempre jugamos contra una moto, implementamos este método para que realice una de las dos acciones.
	 * Acelerar o frenar.
	 */
	public void acelerarFrenar() {
		if (random.nextBoolean()) {
			acelerar();
		} else {
			frenar();
		}
	}
}