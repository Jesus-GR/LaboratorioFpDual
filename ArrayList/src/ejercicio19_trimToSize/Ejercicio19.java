package ejercicio19_trimToSize;

import java.util.ArrayList;

/*19. Write a Java program to trim the capacity of an array list the current list size.*/
public class Ejercicio19 {

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
		
		numero.trimToSize();;
		
		System.out.println(numero);

	}

}
