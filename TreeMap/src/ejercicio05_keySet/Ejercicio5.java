package ejercicio05_keySet;

import java.util.TreeMap;

/*5. Write a Java program to get all keys from the given a Tree Map.*/
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> color = new TreeMap<>();

		color.put(1, "Verde");
		color.put(2, "Amarillo");
		color.put(3, "Azul");
		color.put(4, "Violeta");
		color.put(5, "Rojo");
		color.put(6, "Negro");
		
		System.out.println(color.keySet());

	}

}
