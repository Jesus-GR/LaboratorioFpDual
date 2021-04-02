package ejercicio02_copiarConMapoPutAll;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*2. Write a Java program to copy a Tree Map content to another Tree Map.*/
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> color = new TreeMap<>();

		color.put(1, "Verde");
		color.put(2, "Amarillo");
		color.put(3, "Azul");
		color.put(4, "Violeta");
		color.put(5, "Rojo");
		color.put(6, "Negro");
		
		Map <Integer, String> color2 = new TreeMap<Integer,String>(color);
		
		System.out.println(color2);
		
		//Otra opcioni es:
		 color2.putAll(color);
		
	}

}
