package ejercicio22;

import java.util.LinkedList;

/*22. Write a Java program to check if a particular element exists in a linked list.*/
public class Ejercicio22 {

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
		
		if(color.contains("polfa")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
