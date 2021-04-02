package ejercicio20_ensureCapacity;

import java.util.ArrayList;

/*20. Write a Java program to increase the size of an array list.*/
public class Ejercicio20 {

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
		
		numero.ensureCapacity(2);
		numero.add(9);
		numero.add(10);
		System.out.println(numero);

	}

}
