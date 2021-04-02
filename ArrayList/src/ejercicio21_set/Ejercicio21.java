package ejercicio21_set;

import java.util.ArrayList;

/*21. Write a Java program to replace the second element of a ArrayList with the specified element*/
public class Ejercicio21 {

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
		
		numero.set(3, 7);

	}

}
