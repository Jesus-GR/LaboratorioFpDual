package ejercicio16_shuffle;

import java.util.Collections;
import java.util.LinkedList;

/*16. Write a Java program to shuffle the elements in a linked list.*/
public class Ejercicio16 {

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
		
		Collections.shuffle(color);
		System.out.println(color);

	}

}
