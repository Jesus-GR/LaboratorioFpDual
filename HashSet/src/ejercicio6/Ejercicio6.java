package ejercicio6;

import java.util.HashSet;

/*6. Write a Java program to clone a hash set to another hash set.*/
public class Ejercicio6 {

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
		
		HashSet<Integer> listaClonada = new HashSet<>();
		
		listaClonada =(HashSet) nuevaLista.clone();
		
		System.out.println(listaClonada);
		
	}

}
