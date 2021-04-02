package ejercicio25;

import java.util.LinkedList;

/*25. Write a Java program to test an linked list is empty or not.*/
public class Ejercicio25 {

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
		
		System.out.println(color2.isEmpty()? "Yes": "No");

	}

}
