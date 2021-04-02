package ejercicio7;

import java.util.TreeSet;

/*7. Write a Java program to get the number of elements in a tree set.*/
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> color = new TreeSet<>();

		color.add("Azul");
		color.add("Rojo");
		color.add("yellow");
		color.add("Burdeos");
		color.add("Verde");
		color.add("Violeta");
		color.add("Amarillo");
		color.add("Marrón");
		
		System.out.println(color.size());
		

	}

}
