package ejercicio5;

import java.util.PriorityQueue;

/*5. Write a Java program to remove all the elements from a priority queue.*/
public class Ejercicio5 {

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
		
		//colors.removeAll(colors);
		colors.clear();
	
		
		System.out.println(colors);
	}

}
