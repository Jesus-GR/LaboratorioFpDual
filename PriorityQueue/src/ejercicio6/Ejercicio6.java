package ejercicio6;

import java.util.PriorityQueue;

/*6. Write a Java program to count the number of elements in a priority queue*/
public class Ejercicio6 {

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
		
		System.out.println(colors.size());
	}

}
