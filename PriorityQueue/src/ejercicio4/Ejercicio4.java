package ejercicio4;

import java.util.PriorityQueue;

/*4. Write a Java program to insert a given element into a priority queue.*/
public class Ejercicio4 {

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
		
		//El método offer inserta un elemento dentro de una lista
		colors.offer("Violeta");
		
		System.out.println(colors);
	}

}
