package ejercicio12;

import java.util.LinkedList;

/*12. Write a Java program to remove a specified element from a linked list.*/
public class Ejercicio12 {

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
		
		color.remove(2);
		System.out.println(color);

	}

}
