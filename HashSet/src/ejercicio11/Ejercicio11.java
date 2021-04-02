package ejercicio11;

import java.util.HashSet;


/*11. Write a Java program to compare two sets and retain elements which are same on both sets. */
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> color1 = new HashSet<>();
		
		color1.add("Verde");
		color1.add("Amarillo");
		color1.add("Azul");
		color1.add("Rojo");
		color1.add("Violeta");

		System.out.println(color1);
		HashSet<String> color2 = new HashSet<>();

		color2.add("Naranja");
		color2.add("Azul");
		color2.add("Violeta");
		color2.add("Magenta");
		color2.add("Cian");
		System.out.println(color2);
		
		for (String s : color1) {
			if(color2.contains(s)) {
				System.out.println("Si");
			}else {
				System.out.println("No");
			}
			
		}
		
	}

}
