package ejercicio1;

import java.util.PriorityQueue;

/*1. Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.*/
public class Ejercicio1 {

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
	}

}
