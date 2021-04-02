package ejercicio9;

import java.util.LinkedList;

/*9. Write a Java program to insert some elements at the specified position into a linked list.*/
public class Ejercicio9 {

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
		
		LinkedList<String> elementosAñadir = new LinkedList<String>();
		elementosAñadir.add("Verde");
		elementosAñadir.add("Rosa");
		elementosAñadir.add("Azul");
		
		nuevaLista.addAll(3, elementosAñadir);
		
		System.out.println(nuevaLista);
	}

}
