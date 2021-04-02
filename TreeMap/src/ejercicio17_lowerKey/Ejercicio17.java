package ejercicio17_lowerKey;

import java.util.TreeMap;

/*17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.*/
public class Ejercicio17 {

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
		
		System.out.println(color.lowerKey(5));

	}

}
