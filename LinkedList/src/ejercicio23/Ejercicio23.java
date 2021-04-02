package ejercicio23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*23. Write a Java program to convert a linked list to array list*/
public class Ejercicio23 {

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
		
		List <String> colorArray = new ArrayList<>(color);
		
		System.out.println(colorArray);

	}

}
