package ejercicio17;

import java.util.LinkedList;

/*17. Write a Java program to join two linked lists.*/
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> color = new LinkedList<>();

		color.add("Verde");
		color.add("Amarillo");
		color.add("Azul");
		color.add("Rojo");
		color.add("Violeta");
		color.add("Marrón");
		System.out.println(color);

		LinkedList<String> color2 = new LinkedList<>();

		color2.add("Naranja");
		color2.add("Blanco");
		color2.add("Negro");
		color2.add("Cian");
		color2.add("Magenta");
		color2.add("Gris");

		System.out.println(color2);

		LinkedList<String> color3 = new LinkedList<>();

		color3.addAll(color2);
		color3.addAll(color);
		System.out.println(color3);

	}

}
