package ejercicio7;

import java.util.Iterator;
import java.util.PriorityQueue;

/*7. Write a Java program to compare two priority queues.*/
public class Ejercicio7 {

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
		
		PriorityQueue<String> colors2 = new PriorityQueue<>();
		colors2.add("Verde");
		colors2.add("Cian");
		colors2.add("Magenta");
		colors2.add("Amarillo");
		colors2.add("Negro");
		colors2.add("Blanco");
		
		
		for (String string : colors2) {
			System.out.println(colors.contains(string)? "yes": "no");
		}
	}

}
