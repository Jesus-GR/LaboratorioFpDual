package ejercicio9;

import java.util.TreeSet;

/*9. Write a Java program to find the numbers less than 7 in a tree set.*/
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> numero = new TreeSet<>();
		TreeSet<Integer> nuevoNumero = new TreeSet<>();
		numero.add(1);
		numero.add(2);
		numero.add(3);
		numero.add(4);
		numero.add(5);
		numero.add(6);
		numero.add(7);
		numero.add(8);
		numero.add(9);
		
		nuevoNumero = (TreeSet) numero.headSet(7);
		
		System.out.println(nuevoNumero);

	}

}
