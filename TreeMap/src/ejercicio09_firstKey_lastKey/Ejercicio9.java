package ejercicio09_firstKey_lastKey;

import java.util.TreeMap;

/*9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map*/
public class Ejercicio9 {

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
		
		System.out.println(color.firstKey()); 
		System.out.println(color.lastKey());

	}

}
