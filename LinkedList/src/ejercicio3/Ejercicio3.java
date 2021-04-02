package ejercicio3;

import java.util.Iterator;
import java.util.LinkedList;

/*3. Write a Java program to iterate through all elements in a linked list starting at the specified position.*/
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> nuevaLista = new LinkedList<String>();
		
		nuevaLista.add("Uno");
		nuevaLista.add("Dos");
		nuevaLista.add("Tres");
		nuevaLista.add("Cuatro");
		nuevaLista.add("Cinco");
		nuevaLista.add("Seis");
		
		for (int i = 4; i < nuevaLista.size(); i++) {
			System.out.println(nuevaLista.get(i));
		}
		System.out.println();
		Iterator n = nuevaLista.listIterator(2);
		
		while(n.hasNext()) {
			System.out.println(n.next());
		}
		

	}

}
