package ejercicio24;

import java.util.LinkedList;

/*24. Write a Java program to compare two linked lists*/
public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		LinkedList<String> color = new LinkedList<>();

		color.add("Verde");
		color.add("Amarillo");
		color.add("Azul");
		color.add("Rojo");
		color.add("Violeta");
		color.add("Marr�n");
		System.out.println(color);

		LinkedList<String> color2 = new LinkedList<>();

		color2.add("Naranja");
		color2.add("Blanco");
		color2.add("Negro");
		color2.add("Cian");
		color2.add("Magenta");
		color2.add("Gris");
		
		System.out.println(color2);
		
		for (String colores : color) {
			System.out.println(color2.contains(colores)? "Yes": "No");
		}
		
		
	}

}
