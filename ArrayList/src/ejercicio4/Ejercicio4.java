package ejercicio4;

import java.util.ArrayList;

/*4. Write a Java program to retrieve an element (at a specified index) from a given array list*/
public class Ejercicio4 {

	public static void main(String[] args) {
		ArrayList<String> nuevoArray = new ArrayList<String>();

		nuevoArray.add("H");
		nuevoArray.add("O");
		nuevoArray.add("L");
		nuevoArray.add("A");
		nuevoArray.add("!");
		
		String letra = nuevoArray.get(2);
		System.out.println(letra);

	}
}
