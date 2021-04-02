package ejercicio1;

import java.util.TreeSet;

/*1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.*/
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*El treeSet te lo ordena por orden alfabético y si es numérico de menor a mayor*/
		TreeSet<String> color = new TreeSet<>();
		
		color.add("Azul");
		color.add("Rojo");
		color.add("yellow");
		color.add("Burdeos");
		color.add("Verde");
		color.add("Violeta");
		color.add("Amarillo");
		color.add("Marrón");
		
		
		TreeSet<Integer> numero = new TreeSet<>();
		
		numero.add(8);
		numero.add(0);
		numero.add(21);
		numero.add(1);
		numero.add(7);
		System.out.println(numero);
		
		
		System.out.println(color);
		

	}

}
