package ejercicio2;

import java.util.TreeSet;

/*2. Write a Java program to iterate through all elements in a tree set. */
public class Ejercicio2 {
	public static void main(String[]args) {
TreeSet<String> color = new TreeSet<>();
		
		color.add("Azul");
		color.add("Rojo");
		color.add("yellow");
		color.add("Burdeos");
		color.add("Verde");
		color.add("Violeta");
		color.add("Amarillo");
		color.add("Marrón");
		
		for (String string : color) {
			System.out.print(string+", ");
		}
	}

}
