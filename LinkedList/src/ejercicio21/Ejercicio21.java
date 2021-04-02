package ejercicio21;

import java.util.LinkedList;

/*21. Write a Java program to retrieve but does not remove, the last element of a linked list.*/
public class Ejercicio21 {

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
		
		String ultimoColor = color.peekLast();
		System.out.println(ultimoColor);
		System.out.println(color);
	}

}
