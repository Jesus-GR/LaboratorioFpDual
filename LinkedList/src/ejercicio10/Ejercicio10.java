package ejercicio10;

/*10. Write a Java program to get the first and last occurrence of the specified elements in a linked list*/
import java.util.LinkedList;

public class Ejercicio10 {

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
		
		String primerElemento = nuevaLista.getFirst();
		String ultimoElemento = nuevaLista.getLast();
		
		System.out.println("Primer elemento: "+primerElemento+" Ultimo elemento: "+ultimoElemento);
	}

}
