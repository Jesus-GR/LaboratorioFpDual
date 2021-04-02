package ejercicio7;

import java.util.HashMap;

/*7. Write a Java program to test if a map contains a mapping for the specified key*/
public class Ejercicio7 {

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
		
		if(nuevoMap.containsKey(10)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
