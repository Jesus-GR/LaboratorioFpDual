package ejercicio2;

import java.util.HashMap;

/*2. Write a Java program to count the number of key-value (size) mappings in a map.*/
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> nuevoMap = new HashMap<>();

		nuevoMap.put(1, "UNO");
		nuevoMap.put(2, "Dos");
		nuevoMap.put(3, "Tres");
		nuevoMap.put(4, "Cuatro");
		nuevoMap.put(5, "Cinco");
		nuevoMap.put(6, "Seis");
		nuevoMap.put(7, "Siete");

		System.out.println(nuevoMap.size());
	}

}
