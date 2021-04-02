package ejercicio18_navigableKeySet;

import java.util.TreeMap;

/*18. Write a Java program to get NavigableSet view of the keys contained in a map. */
public class Ejercicio18 {

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
		
		System.out.println(color.navigableKeySet());

	}

}
