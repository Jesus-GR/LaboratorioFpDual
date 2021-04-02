package ejercicio11_Collection.reverse;

import java.util.ArrayList;
import java.util.Collections;

/*11. Write a Java program to reverse elements in a array list.*/
public class Ejercicio11 {

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
		
	Collections.reverse(numero);
	System.out.println(numero);
		

		
		

	}

}
