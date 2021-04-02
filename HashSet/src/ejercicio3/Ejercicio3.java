package ejercicio3;

import java.util.HashSet;

/*3. Write a Java program to get the number of elements in a hash set.*/
public class Ejercicio3 {

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
		
		System.out.println(nuevaLista.size());

	}

}
