package ejercicio01;

import java.util.Map;
import java.util.TreeMap;

/*1. Write a Java program to associate the specified value with the specified key in a Tree Map.*/
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> color = new TreeMap<>();
		
		color.put(1, "Verde");
		color.put(2, "Amarillo");
		color.put(3,"Azul");
		color.put(4, "Violeta");
		color.put(5, "Rojo");
		color.put(6, "Negro");
		
		for(Map.Entry m : color.entrySet()) {
			System.out.print(m.getKey()+"--"+m.getValue());
			System.out.println();
		}

	}

}
