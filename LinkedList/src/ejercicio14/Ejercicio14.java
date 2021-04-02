package ejercicio14;

import java.util.LinkedList;

/*14. Write a Java program to remove all the elements from a linked list*/
public class Ejercicio14 {

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
		
		color.removeAll(color);
		System.out.println(color);

	}

}
