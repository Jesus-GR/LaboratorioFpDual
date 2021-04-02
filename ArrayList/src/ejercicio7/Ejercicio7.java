package ejercicio7;

import java.util.ArrayList;

/*7. Write a Java program to search an element in a array list. */
public class Ejercicio7 {

	public static void main (String[]args) {
		
		ArrayList<String> nuevoArray = new ArrayList<String>();

		nuevoArray.add("H");
		nuevoArray.add("O");
		nuevoArray.add("L");
		nuevoArray.add("A");
		nuevoArray.add("!");
		
		if(nuevoArray.contains("p")) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");
		}
	}
}
