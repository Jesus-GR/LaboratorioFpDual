package ejercicio3;

import java.util.ArrayList;

/*3. Write a Java program to insert an element into the array list at the first position.*/
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> nuevoArray = new ArrayList<String>();
		
		nuevoArray.add("H");
		nuevoArray.add("O");
		nuevoArray.add("L");
		nuevoArray.add("A");
		nuevoArray.add("!");
		
		for (String string : nuevoArray) {
			System.out.print(string);
		}
		
		nuevoArray.add(0, "¡");
		System.out.println();
		for (String string : nuevoArray) {
			System.out.print(string);
		}

	}

}
