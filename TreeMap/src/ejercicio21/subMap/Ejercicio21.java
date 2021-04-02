package ejercicio21.subMap;

import java.util.TreeMap;

/*21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).*/
public class Ejercicio21 {

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
		
		System.out.println(color.subMap(2, 5));

	}

}
