package ejercicio13;

import java.util.TreeSet;

/*13. Write a Java program to get an element in a tree set which is strictly less than the given element.*/
public class Ejercicio13 {

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
		System.out.println(numero.lower(10));
	}

}
