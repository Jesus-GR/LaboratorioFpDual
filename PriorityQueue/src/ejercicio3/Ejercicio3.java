package ejercicio3;

import java.util.PriorityQueue;

/*3. Write a Java program to add all the elements of a priority queue to another priority queue.*/
public class Ejercicio3 {

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
		
		colors2.addAll(colors);
		
		System.out.println(colors2);
		
	}

}
