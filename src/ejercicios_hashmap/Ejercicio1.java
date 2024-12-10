package ejercicios_hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Crear un HashMap...
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(0, "Java");
		map.put(1, "C");
		map.put(2, "Python");
		map.put(3, "JavaScript");
		map.put(4, "PHP");
		map.put(5, "C++");
		
		System.out.println(map.get(1));
		System.out.println(map.get(3));
		System.out.println(map.get(5));
		
		map.put(1, "C Sharp");
		
		System.out.println(map.get(1));
		
		int tam = map.size();
		
		System.out.println("El tamaño del mapa es " + tam);
		
		map.remove(5);
		
		System.out.println(map);
		
		for (int clave : map.keySet()) {
			String nombre = map.get(clave);
			System.out.println(clave + ": " + nombre);
		}
		
		for (String value : map.values()) {
			System.out.println(value);
		}
		
		for (Entry<Integer, String> cosas : map.entrySet()) {
			System.out.printf("Keys: %d Valores: %s\n", cosas.getKey(), cosas.getValue());
		}
		
		if (map.containsValue("Java")) {
			System.out.println("Si contiene Java.");
		} else {
			System.out.println("No contiene Java.");
		}
		
		if (map.containsValue("Obix")) {
			System.out.println("Si contiene Obix.");
		} else {
			System.out.println("No contiene Obix.");
		}
	}
}