package ejercicio7;

import java.util.HashSet;

/*7. Write a Java program to convert a hash set to an array.*/
public class Ejercicio7 {

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
		
		Integer[] nuevoArray = new Integer[nuevaLista.size()];
		
		nuevaLista.toArray(nuevoArray);
		for (Integer integer : nuevoArray) {
			System.out.println(integer);
		}
	}

}
