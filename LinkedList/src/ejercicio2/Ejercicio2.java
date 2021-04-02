package ejercicio2;

import java.util.LinkedList;

/*2. Write a Java program to iterate through all elements in a linked list.*/
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> nuevaLista = new LinkedList<String>();
		
		nuevaLista.add("Uno");
		nuevaLista.add("Dos");
		nuevaLista.add("Tres");
		nuevaLista.add("Cuatro");
		nuevaLista.add("Cinco");
		nuevaLista.add("Seis");
		
		for (String string : nuevaLista) {
			System.out.println(string);
		}

	}

}
