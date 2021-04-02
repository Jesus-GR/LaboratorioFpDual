package ejercicio8;

import java.util.ArrayList;
import java.util.Collections;

/*8. Write a Java program to sort a given array list.*/
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nuevoArray = new ArrayList<String>();

		nuevoArray.add("c");
		nuevoArray.add("d");
		nuevoArray.add("a");
		nuevoArray.add("z");
		nuevoArray.add("b");
		
		Collections.sort(nuevoArray);
		
		System.out.println(nuevoArray);
	}

}
