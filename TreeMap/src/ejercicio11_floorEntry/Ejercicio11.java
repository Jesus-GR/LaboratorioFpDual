package ejercicio11_floorEntry;

import java.util.TreeMap;

/*11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key. */
public class Ejercicio11 {

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
		System.out.println(color.floorEntry(1));

	}

}
