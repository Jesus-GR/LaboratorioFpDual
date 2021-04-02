package ejercicio13;
/*13. Write a Java program to remove first and last element from a linked list.*/
import java.util.LinkedList;

public class Ejercicio13 {

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
		
		color.removeFirst();
		color.removeLast();
		System.out.println(color);

	}

}
