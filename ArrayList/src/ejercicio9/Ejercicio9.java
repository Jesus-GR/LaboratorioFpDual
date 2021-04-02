package ejercicio9;

import java.util.ArrayList;
import java.util.Collections;

/*9. Write a Java program to copy one array list into another.*/
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> nuevoArray = new ArrayList<String>();

		nuevoArray.add("c");
		nuevoArray.add("d");
		nuevoArray.add("a");
		nuevoArray.add("z");
		nuevoArray.add("b");
		
		ArrayList<String> copiaArray = nuevoArray;
		
		System.out.println(copiaArray);
		
		ArrayList<String> copiaArray2 = new ArrayList<String>();
		
		copiaArray2.add("Uno");
		copiaArray2.add("Dos");
		copiaArray2.add("Tres");
		copiaArray2.add("Cuatro");
		copiaArray2.add("Cinco");
		
		
		Collections.copy(copiaArray2,nuevoArray);
		System.out.println(nuevoArray);
		System.out.println(copiaArray2);
		System.out.println(copiaArray);
		
	}

}
