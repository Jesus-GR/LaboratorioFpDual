package ejercicio5;

import java.util.TreeSet;

/*5. Write a Java program to get the first and last elements in a tree set.*/
public class Ejercicio5 {

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
		System.out.println(color);
		
		String primerElemento = color.first();
		String ultimoElemento = color.last();
		System.out.println(primerElemento);
		System.out.println(ultimoElemento);

	}

}
