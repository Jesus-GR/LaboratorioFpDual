package ejercicio19;

import java.util.LinkedList;

/*19. Write a Java program to remove and return the first element of a linked list*/
public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> color = new LinkedList<>();

		color.add("Verde");
		color.add("Amarillo");
		color.add("Azul");
		color.add("Rojo");
		color.add("Violeta");
		color.add("Marrón");
		System.out.println(color);
		
		System.out.println(color.pollFirst());
		
		System.out.println(color);

	}

}
