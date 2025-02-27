package ejercicios_refuerzo;

public class Airplane {

	private String marca;
	private String modelo;
	private int numPasajeros;
	
	// Constructores
	public Airplane(String marca) {
		this.marca = marca;
	}

	public Airplane(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Airplane(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	
	// Métodos
	public static boolean sonIguales(Airplane avion1, Airplane avion2) {
		if (avion1.getMarca().equals(avion2.getMarca()) && avion1.getModelo().equals(avion2.getModelo())) {
			return true;
		} 
		
		return false;
	}
	
	/*
	@Override
	public static boolean equals(Object obj) {
		if (!(obj instanceof Airplane)) {
			return false;
		}
		
		Airplane otherAirplane = (Airplane) obj;
		
		return otherAirplane.marca.equals(obj)
	}
	*/
	
	@Override
	public String toString() {
		return "Airplane [marca=" + marca + ", modelo=" + modelo + ", numPasajeros=" + numPasajeros + "]";
	}
	
	// Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
}