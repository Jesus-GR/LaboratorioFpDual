package ejercicio6;

import java.util.ArrayList;

/*6. Write a Java program to remove the third element from a array list.*/

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> nuevoArray = new ArrayList<String>();

		nuevoArray.add("H");
		nuevoArray.add("O");
		nuevoArray.add("L");
		nuevoArray.add("A");
		nuevoArray.add("!");

		System.out.println(nuevoArray);
		
		nuevoArray.remove(3);
		
		System.out.println(nuevoArray);
	}

}
