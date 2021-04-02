package ejercicio9;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


/*9. Write a Java program to convert a hash set to a List/ArrayList.*/
public class Ejercicio9 {

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
		
		List <Integer> nuevoArray =  new ArrayList<Integer>(nuevaLista);
		
		for (Integer integer : nuevoArray) {
			System.out.println(integer);
		}
	}

}
