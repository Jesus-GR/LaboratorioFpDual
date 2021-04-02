package ejercicio5;

import java.util.LinkedList;

/*5. Write a Java program to insert the specified element at the specified position in the linked list.*/
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

LinkedList<String> nuevaLista = new LinkedList<String>();
		
		nuevaLista.add("Uno");
		nuevaLista.add("Dos");
		nuevaLista.add("Tres");
		nuevaLista.add("Cuatro");
		nuevaLista.add("Cinco");
		nuevaLista.add("Seis");
		
		nuevaLista.add(3, "Tres y medio");
		
		System.out.println(nuevaLista);
	}

}
