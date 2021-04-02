package ejercicio9;

import java.util.HashMap;
import java.util.Set;

/*9. Write a Java program to create a set view of the mappings contained in a map.*/
public class Ejercicio9 {

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
		
		Set set = nuevoMap.entrySet();
		
		System.out.println(set);

	}

}
