package ejercicio10;

import java.util.ArrayList;
import java.util.Collections;

/*10. Write a Java program to shuffle elements in a array list.*/
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String> copiaArray2 = new ArrayList<String>();
		
		copiaArray2.add("Uno");
		copiaArray2.add("Dos");
		copiaArray2.add("Tres");
		copiaArray2.add("Cuatro");
		copiaArray2.add("Cinco");
		System.out.println(copiaArray2);
		
		Collections.shuffle(copiaArray2);
		System.out.println(copiaArray2);
	}

}
