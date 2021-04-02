package ejercicio1;

import java.util.HashSet;

/*1. Write a Java program to append the specified element to the end of a hash set.*/
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> nuevaLista = new HashSet<>();
		
		nuevaLista.add(1);
		nuevaLista.add(2);
		nuevaLista.add(3);
		nuevaLista.add(4);
		nuevaLista.add(5);
		
		System.out.println(nuevaLista);
		nuevaLista.add(6);
		
		System.out.println(nuevaLista);
	}

}
