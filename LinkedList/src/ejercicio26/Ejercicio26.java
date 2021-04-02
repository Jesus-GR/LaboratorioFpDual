package ejercicio26;

import java.util.LinkedList;

/*26. Write a Java program to replace an element in a linked list.*/
public class Ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> color2 = new LinkedList<>();

		color2.add("Naranja");
		color2.add("Blanco");
		color2.add("Negro");
		color2.add("Cian");
		color2.add("Magenta");
		color2.add("Gris");
		
		System.out.println(color2);
		
		color2.set(2, "Lima");
		System.out.println(color2);

	}

}
