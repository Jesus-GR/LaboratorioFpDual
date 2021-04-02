package ejercicio4;

import java.util.HashSet;

/*4. Write a Java program to empty an hash set*/
public class Ejercicio4 {

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
		
		nuevaLista.clear();
		nuevaLista.removeAll(nuevaLista);
		System.out.println(nuevaLista);

	}

}
