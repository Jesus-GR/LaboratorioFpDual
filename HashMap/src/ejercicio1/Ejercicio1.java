package ejercicio1;

import java.util.HashMap;
import java.util.Map;

/*1. Write a Java program to associate the specified value with the specified key in a HashMap. */
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> nuevoMap = new HashMap<>();
		
		nuevoMap.put(1,"UNO");
		nuevoMap.put(2,"Dos");
		nuevoMap.put(3,"Tres");
		nuevoMap.put(4,"Cuatro");
		nuevoMap.put(5,"Cinco");
		nuevoMap.put(6,"Seis");
		nuevoMap.put(7,"Siete");
		
		for(Map.Entry x : nuevoMap.entrySet()) {
			System.out.println(x.getKey()+"--"+x.getValue());
		}
		
	}

}
