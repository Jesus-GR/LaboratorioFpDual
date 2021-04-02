package ejercicio10;

import java.util.HashMap;

/*10. Write a Java program to get the value of a specified key in a map.*/
public class Ejercicio10 {

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
		
		System.out.println(nuevoMap.get(4));
		
	}

}
