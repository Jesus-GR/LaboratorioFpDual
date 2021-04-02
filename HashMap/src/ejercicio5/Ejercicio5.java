package ejercicio5;

import java.util.HashMap;
import java.util.Map;

/*5. Write a Java program to check whether a map contains key-value mappings (empty) or not.*/
public class Ejercicio5 {

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
		
		if(nuevoMap.isEmpty()) {
			System.out.println("Esta vacío");
		}else {
			System.out.println("No esta vacío");
		}
		
		nuevoMap.clear();
		
		if(nuevoMap.isEmpty()) {
			System.out.println("Esta vacío");
		}else {
			System.out.println("No esta vacío");
		}
	}

}
