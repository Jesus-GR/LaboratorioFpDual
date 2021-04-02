package ejercicio4;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/*4. Write a Java program to create a reverse order view of the elements contained in a given tree set.*/
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> color = new TreeSet<>();

		color.add("Azul");
		color.add("Rojo");
		color.add("yellow");
		color.add("Burdeos");
		color.add("Verde");
		color.add("Violeta");
		color.add("Amarillo");
		color.add("Marrón");
		System.out.println(color);
		
		Iterator it = color.descendingIterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+", ");
		}
		
	}

}
