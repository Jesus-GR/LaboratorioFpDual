package ejercicio10_descendingKey;

import java.util.TreeMap;

/*10. Write a Java program to get a reverse order view of the keys contained in a given map.*/
public class Ejercicio10 {

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
		
		
		System.out.println(color.descendingKeySet());

	}

}
