package ejercicio07_comparator;

import java.util.Comparator;
import java.util.TreeMap;

/*7. Write a Java program to sort keys in Tree Map by using comparator.*/
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> color = new TreeMap<>();

		color.put(1, "Verde");
		color.put(2, "Amarillo");
		color.put(3, "Azul");
		color.put(4, "Violeta");
		color.put(5, "Rojo");
		color.put(6, "Negro");
		System.out.println(color);
		color.comparator();
		System.out.println(color);
		
		class sort_key implements Comparator<String>{
		     @Override
		    public int compare(String str1, String str2) {
		        return str1.compareTo(str2);
		        }

	   }
	}
	

}
