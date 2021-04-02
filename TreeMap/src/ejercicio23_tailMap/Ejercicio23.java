package ejercicio23_tailMap;

import java.util.TreeMap;

/*23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key*/
public class Ejercicio23 {

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
		
		System.out.println(color.tailMap(3));

	}

}
