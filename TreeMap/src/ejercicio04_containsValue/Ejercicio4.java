package ejercicio04_containsValue;

import java.util.TreeMap;

/*4. Write a Java program to search a value in a Tree Map*/
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> color = new TreeMap<>();

		color.put(1, "Verde");
		color.put(2, "Amarillo");
		color.put(3, "Azul");
		color.put(4, "Violeta");
		color.put(5, "Rojo");
		color.put(6, "Negro");
		
		if(color.containsValue("Rojlo")) {
			System.out.println("Está");
		}else {
			System.out.println("No está");
		}

	}

}
