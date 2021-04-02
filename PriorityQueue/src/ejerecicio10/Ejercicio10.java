package ejerecicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/*10. Write a Java program to convert a priority queue to an array containing all of the elements of the queue.*/
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> colors = new PriorityQueue<>();

		colors.add("Rojo");
		colors.add("Naranja");
		colors.add("Amarillo");
		colors.add("Verde");
		colors.add("Azul");
		colors.add("Morado");
		
		System.out.println(colors);
		
		//Esto es una forma de hacerlo
		/*String[] arrayColores = new String[colors.size()];
		
		colors.toArray(arrayColores);
		
		for (String string : arrayColores) {
			System.out.println(string);
		}*/
		
		List<String> arrayColores = new ArrayList<String>(colors);
		
		for (String string : arrayColores) {
			System.out.println(string);
		}
	}

}
