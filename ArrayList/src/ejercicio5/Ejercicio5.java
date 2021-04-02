package ejercicio5;

import java.util.ArrayList;

/*5. Write a Java program to update specific array element by given element*/
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nuevoArray = new ArrayList<String>();

		nuevoArray.add("H");
		nuevoArray.add("O");
		nuevoArray.add("L");
		nuevoArray.add("A");
		nuevoArray.add("!");
		
		nuevoArray.set(0, "M");
		
		String letra = nuevoArray.get(0);
		System.out.println(letra);
		
	}

}
