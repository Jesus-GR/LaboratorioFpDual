package ejercicio6;

import java.util.LinkedList;

/*6. Write a Java program to insert elements into the linked list at the first and last position. */
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

LinkedList<String> nuevaLista = new LinkedList<String>();
		
		nuevaLista.add("Uno");
		nuevaLista.add("Dos");
		nuevaLista.add("Tres");
		nuevaLista.add("Cuatro");
		nuevaLista.add("Cinco");
		nuevaLista.add("Seis");
		
		nuevaLista.add(0, "Cero");
		nuevaLista.add(nuevaLista.size(), "Siete");
		System.out.println(nuevaLista);
		
		/*Otra forma de insertar en la priemra y última posición*/
		
		nuevaLista.addFirst("Menos uno");
		nuevaLista.addLast("Ocho");
		System.out.println(nuevaLista);
	}

}
