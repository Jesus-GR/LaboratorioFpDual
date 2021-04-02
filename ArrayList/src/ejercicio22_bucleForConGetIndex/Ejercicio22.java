package ejercicio22_bucleForConGetIndex;

import java.util.ArrayList;

/*22. Write a Java program to print all the elements of a ArrayList using the position of the elements*/
public class Ejercicio22 {

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
		
		for (int i = 0; i < numero.size(); i++) {
			System.out.println(numero.get(i));
		}

	}

}
