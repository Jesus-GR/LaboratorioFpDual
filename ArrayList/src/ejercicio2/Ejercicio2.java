package ejercicio2;

import java.util.ArrayList;

/*2. Write a Java program to iterate through all elements in a array list.*/
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> nuevoArray = new ArrayList<String>();
		
		nuevoArray.add("H");
		nuevoArray.add("O");
		nuevoArray.add("L");
		nuevoArray.add("A");
		nuevoArray.add("!");
		
		for (String string : nuevoArray) {
			System.out.println(string);
		}
		
	}

}
