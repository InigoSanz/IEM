package ejercicios_herencia;

public abstract class Instrumento {
	
	protected int nRopes;
	
	public Instrumento (int nRopes) {
		this.nRopes = nRopes;
	}
	
	public int getnRopes() {
		return nRopes;
	}

	public void setnRopes(int nRopes) {
		this.nRopes = nRopes;
	}
	
	abstract String sonido();
}