package ejercicios_arraylist;

import java.util.ArrayList;

/**
 * Crea un ArrayList y amacena los meses del año.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		String[] arrayMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		ArrayList<String> meses = new ArrayList<>();
		
		for (String mes : arrayMeses) {
			meses.add(mes);
		}
		
		for (String mes1 : meses) {
			System.out.println(mes1);
		}
		
		meses.set(7, meses.get(7).toUpperCase());
		
		System.out.println(meses.get(7));
		
		int cantidadMeses = meses.size();
		
		System.out.println("Un año tiene " + cantidadMeses + " meses.");
		
		meses.add("Mes final");
		
		System.out.printf("Añadido: %s\n", meses.get(cantidadMeses - 1));
		
		meses.remove(meses.size() - 1);
		
		System.out.printf("Eliminamos el anterior, ahora el último es: %s\n", meses.get(cantidadMeses - 1));
		
		String mesCorto = meses.get(0);
		
		for (String mes : meses) {
			if (mesCorto.length() > mes.length()) {
				mesCorto = mes;
			}		
		}
		
		System.out.printf("El més mas corto (carácteres) es: %s\n", mesCorto);
	}
}