package ejercicio9;

import java.util.PriorityQueue;

/*9. Write a Java program to retrieve and remove the first element. */
public class Ejercicio9 {

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
		
		String elemento = colors.poll();
		System.out.println(colors);
		System.out.println(elemento);
	}

}
