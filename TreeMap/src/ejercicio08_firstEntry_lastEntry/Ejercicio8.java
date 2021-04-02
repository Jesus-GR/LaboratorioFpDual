package ejercicio08_firstEntry_lastEntry;

import java.util.TreeMap;

/*8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map*/
public class Ejercicio8 {

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
		
		System.out.println(color.firstEntry()); 
		System.out.println(color.lastEntry());

	}

}
