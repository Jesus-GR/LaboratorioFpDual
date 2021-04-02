package ejercicio1;

import java.util.LinkedList;

/*1. Write a Java program to append the specified element to the end of a linked list.*/
public class Ejercicio1 {

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
		
		nuevaLista.add("Siete");
		System.out.println(nuevaLista);
		
	}

}
