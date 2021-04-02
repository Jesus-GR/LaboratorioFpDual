package ejercicio11;

import java.util.PriorityQueue;

/*11. Write a Java program to convert a Priority Queue elements to a string representation.*/
public class Ejercicio11 {

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
		
		String color = colors.toString();
		System.out.print(color);
	}

}
