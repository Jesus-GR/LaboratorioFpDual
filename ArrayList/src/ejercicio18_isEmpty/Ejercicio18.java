package ejercicio18_isEmpty;

import java.util.ArrayList;

/*18. Write a Java program to test an array list is empty or not.*/
public class Ejercicio18 {

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
		
		System.out.println(numero.isEmpty()?"Yes": "No");
	}

}
