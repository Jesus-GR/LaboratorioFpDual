package ejercicio8;

import java.util.TreeSet;

/*8. Write a Java program to compare two tree sets.*/
public class Ejercicio8 {
	public static void main(String []args) {
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
		
		TreeSet<String> nuevoColor = new TreeSet<>();
		
		nuevoColor.add("Azul");
		nuevoColor.add("Morado");
		nuevoColor.add("Violeta");
		nuevoColor.add("Amarillo");
		nuevoColor.add("Cian");
		nuevoColor.add("Magenta");
		nuevoColor.add("Marrón");
		nuevoColor.add("Burdeos");
		System.out.println(nuevoColor);
		
		for (String string :color) {
			if(nuevoColor.contains(string)) {
				System.out.println("Si");
			}else {
				System.out.println("No");
			}
		}
		
		
	}

}
