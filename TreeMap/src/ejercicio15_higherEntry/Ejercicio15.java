package ejercicio15_higherEntry;

import java.util.TreeMap;

/*15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key*/
public class Ejercicio15 {

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
		
		System.out.println(color.higherEntry(5));

	}

}
