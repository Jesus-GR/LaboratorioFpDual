package ejercicio6;

import java.util.HashMap;

/*6. Write a Java program to get a shallow copy of a HashMap instance*/
public class Ejercicio6 {
	public static void main (String[]args) {
		
		HashMap<Integer, String> nuevoMap = new HashMap<>();

		nuevoMap.put(1, "UNO");
		nuevoMap.put(2, "Dos");
		nuevoMap.put(3, "Tres");
		nuevoMap.put(4, "Cuatro");
		nuevoMap.put(5, "Cinco");
		nuevoMap.put(6, "Seis");
		nuevoMap.put(7, "Siete");
		
		HashMap<Integer, String> nuevoMapa = new HashMap<>();
	
		 nuevoMapa = (HashMap)nuevoMap.clone();
		 
		 System.out.println(nuevoMapa);
	}

}
