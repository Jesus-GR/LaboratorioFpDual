package ejercicio11;

import java.util.LinkedList;

/*11. Write a Java program to display the elements and their positions in a linked list.*/
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> color = new LinkedList<>();
		
		color.add("Verde");
		color.add("Amarillo");
		color.add("Azul");
		color.add("Rojo");
		color.add("Violeta");
		color.add("Marr�n");
		
		for (int i = 0; i < color.size(); i++) {
			System.out.println("�ndice "+i+" Color "+color.get(i));
		}

	}

}
