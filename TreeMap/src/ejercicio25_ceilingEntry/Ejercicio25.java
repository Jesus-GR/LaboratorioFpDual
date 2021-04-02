package ejercicio25_ceilingEntry;

import java.util.TreeMap;

/*25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.*/
public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> color = new TreeMap<>();

		color.put(1, "Verde");
		color.put(2, "Amarillo");
		color.put(3, "Azul");
		color.put(4, "Violeta");
		color.put(5, "Rojo");
		color.put(6, "Negro");
		
		System.out.println(color.ceilingEntry(5));

	}

}
