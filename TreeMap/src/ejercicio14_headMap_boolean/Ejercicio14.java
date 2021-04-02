package ejercicio14_headMap_boolean;

import java.util.TreeMap;

/*14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key*/
public class Ejercicio14 {

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
		
		System.out.println(color.headMap(5, true));
	}

}
