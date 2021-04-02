package ejercicio5;

import java.util.HashSet;

/*5. Write a Java program to test a hash set is empty or not.*/
public class Ejercicio5 {

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
		nuevaLista.removeAll(nuevaLista);
		if(nuevaLista.isEmpty()) {
			System.out.println("Esta vacia");
		}else {
			System.out.println("No esta vacia");
		}
		
	}

}
