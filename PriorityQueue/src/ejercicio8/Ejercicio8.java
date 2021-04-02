package ejercicio8;

import java.util.PriorityQueue;

/*8. Write a Java program to retrieve the first element of the priority queue.*/
public class Ejercicio8 {

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
		
		String elemento = colors.peek();
		System.out.println(elemento);
	}

}
