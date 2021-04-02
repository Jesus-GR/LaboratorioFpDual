package ejercicio19_pollFirstEntry;

import java.util.Map;
import java.util.TreeMap;

/*19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.*/
public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> color = new TreeMap<>();

		color.put(1, "Verde");
		color.put(2, "Amarillo");
		color.put(3, "Azul");
		color.put(4, "Violeta");
		color.put(5, "Rojo");
		color.put(6, "Negro");
		System.out.println(color);
		
		System.out.println(color.pollFirstEntry()); 

	}

}
