package ejercicio11;

import java.util.TreeSet;

/*11. Write a Java program to get the element in a tree set which is less than or equal to the given element.*/
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> numero = new TreeSet<>();
		
		numero.add(10);
		numero.add(0);
		numero.add(150);
		numero.add(21);
		numero.add(60);
		numero.add(53);
		numero.add(89);
		numero.add(4);
		numero.add(9);
		numero.add(10);
		System.out.println(numero);
		System.out.println(numero.floor(53));
		

	}

}
