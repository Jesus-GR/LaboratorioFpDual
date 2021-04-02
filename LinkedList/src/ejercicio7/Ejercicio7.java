package ejercicio7;

import java.util.LinkedList;

/*7. Write a Java program to insert the specified element at the front of a linked list*/
public class Ejercicio7 {

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
		nuevaLista.offerFirst("Cero");
		nuevaLista.offerLast("Siete");

		System.out.println(nuevaLista);
	}

}
