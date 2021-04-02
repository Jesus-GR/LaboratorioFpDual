package ejercicio13_contains;

import java.util.ArrayList;
import java.util.Iterator;

/*13. Write a Java program to compare two array lists.*/
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numero = new ArrayList<>();

		numero.add(0);
		numero.add(1);
		numero.add(2);
		numero.add(3);
		numero.add(4);
		numero.add(5);
		numero.add(6);
		numero.add(7);
		numero.add(8);
		System.out.println(numero);
		
		ArrayList<Integer> numero2 = new ArrayList<>();
		numero2.add(2);
		numero2.add(6);
		numero2.add(1);
		numero2.add(10);
		numero2.add(3);
		System.out.println(numero2);
		
		for (Integer i : numero) {
			System.out.println(numero2.contains(i)? "Si": "No");
		}

	}

}
