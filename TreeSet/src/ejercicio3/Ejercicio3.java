package ejercicio3;

import java.util.TreeSet;
import java.util.Set;

/*3. Write a Java program to add all the elements of a specified tree set to another tree set.*/
public class Ejercicio3 {

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
		
		//Set <String> nuevoSet = new TreeSet<>(color);
		
		/*Otro método distinto*/
		TreeSet<String> nuevoSet = new TreeSet<>();
		
		nuevoSet.addAll(color);
		System.out.println(nuevoSet);
	}

}
