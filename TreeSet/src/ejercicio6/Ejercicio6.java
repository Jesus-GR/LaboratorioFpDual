package ejercicio6;

import java.util.TreeSet;
import java.util.Set;

/*6. Write a Java program to clone a tree set list to another tree set.*/
public class Ejercicio6 {

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
		//Set<String> nuevoSet = new TreeSet<String>(color);
		TreeSet<String> nuevoSet =  (TreeSet<String>)color.clone();
		System.out.println(nuevoSet);

	}

}
