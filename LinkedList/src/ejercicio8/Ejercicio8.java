package ejercicio8;

import java.util.LinkedList;

/*8. Write a Java program to insert the specified element at the end of a linked list. */
public class Ejercicio8 {

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

		nuevaLista.offerLast("Siete");

		System.out.println(nuevaLista);
	}

}
