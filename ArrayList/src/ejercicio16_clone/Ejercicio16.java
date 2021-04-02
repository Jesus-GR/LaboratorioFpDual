package ejercicio16_clone;

import java.util.ArrayList;
import java.util.List;

/*16. Write a Java program to clone an array list to another array list.*/
public class Ejercicio16 {

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
		
		//List<Integer> arrayClon = new ArrayList<>(numero);
		ArrayList<Integer>arrayClon = (ArrayList<Integer>)numero.clone();
		
		System.out.println(arrayClon);
		
		

	}

}
