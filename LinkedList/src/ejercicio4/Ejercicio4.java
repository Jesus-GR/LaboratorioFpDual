package ejercicio4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

/*4. Write a Java program to iterate a linked list in reverse order.*/
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LinkedList<String> nuevaLista = new LinkedList<String>();
		
		nuevaLista.add("Uno");
		nuevaLista.add("Dos");
		nuevaLista.add("Tres");
		nuevaLista.add("Cuatro");
		nuevaLista.add("Cinco");
		nuevaLista.add("Seis");
		System.out.println(nuevaLista);
		Collections.reverse(nuevaLista);
		System.out.println();
		for (String string : nuevaLista) {
			System.out.println(string);
		}
		System.out.println();
		
		/*Estos es otra forma de invertir la lista*/
		Iterator it = nuevaLista.descendingIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
