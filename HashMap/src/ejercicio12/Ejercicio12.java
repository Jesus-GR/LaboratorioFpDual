package ejercicio12;

import java.util.HashMap;
import java.util.Set;

/*12. Write a Java program to get a collection view of the values contained in this map*/
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> nuevoMap = new HashMap<>();

		nuevoMap.put(1, "Uno");
		nuevoMap.put(2, "Dos");
		nuevoMap.put(3, "Tres");
		nuevoMap.put(4, "Cuatro");
		nuevoMap.put(5, "Cinco");
		nuevoMap.put(6, "Seis");
		nuevoMap.put(7, "Siete");
		
		System.out.println(nuevoMap.values());
		
	}

}
