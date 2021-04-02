package ejercicio14_Collections.swap;
/*14. Write a Java program of swap two elements in an array list.*/
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio14 {

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
		
		Collections.swap(numero, 0, 8);
		System.out.println(numero);
		
		
	}

}
