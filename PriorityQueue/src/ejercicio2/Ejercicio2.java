package ejercicio2;

import java.util.PriorityQueue;

/*
 * 2. Write a Java program to iterate through all elements in priority queue.*/
public class Ejercicio2 {

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
		for (String i : colors) {
		System.out.println(i);	
		}

	}

}
