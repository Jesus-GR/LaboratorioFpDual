package ejercicio12;

import java.util.HashSet;

/*12. Write a Java program to remove all of the elements from a hash set.*/
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
HashSet<String> color1 = new HashSet<>();
		
		color1.add("Verde");
		color1.add("Amarillo");
		color1.add("Azul");
		color1.add("Rojo");
		color1.add("Violeta");

		System.out.println(color1);
		
		color1.removeAll(color1);
		System.out.println(color1);

	}

}
