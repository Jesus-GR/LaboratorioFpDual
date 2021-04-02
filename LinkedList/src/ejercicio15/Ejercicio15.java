package ejercicio15;

import java.util.Collections;
import java.util.LinkedList;

/*15. Write a Java program of swap two elements in a linked list.*/
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LinkedList<String> color = new LinkedList<>();
		
		color.add("Verde");
		color.add("Amarillo");
		color.add("Azul");
		color.add("Rojo");
		color.add("Violeta");
		color.add("Marrón");
		System.out.println(color);
		
		Collections.swap(color, 3, 5);
		System.out.println(color);

	}

}
