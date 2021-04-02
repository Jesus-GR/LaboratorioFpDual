package ejercicio8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*8. Write a Java program to convert a hash set to a tree set.*/
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> nuevaLista = new HashSet<>();

		nuevaLista.add(1);
		nuevaLista.add(2);
		nuevaLista.add(3);
		nuevaLista.add(4);
		nuevaLista.add(5);
		nuevaLista.add(6);
		System.out.println(nuevaLista);
		
		Set<Integer> arbol = new TreeSet<Integer>(nuevaLista);
		
		System.out.println(arbol);
	}

}
