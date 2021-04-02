package ejercicio20;

import java.util.LinkedList;

/*20. Write a Java program to retrieve but does not remove, the first element of a linked list.*/
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
		
		String color1 = color.peekFirst();
		
		System.out.println(color1);
		System.out.println(color);
	}

}
