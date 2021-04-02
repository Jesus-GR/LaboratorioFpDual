package ejercicio18;

import java.util.LinkedList;

/*18. Write a Java program to clone an linked list to another linked list. */
public class Ejercicio18 {

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
		
		LinkedList<String> color2 = (LinkedList <String>)(color.clone());
		
		System.out.println(color2);

	}

}
