package ejercicio06_clear;

import java.util.TreeMap;

/*6. Write a Java program to delete all elements from a given Tree Map*/
public class Ejercicio6 {

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
		color.clear();
		System.out.println(color);

	}

}
