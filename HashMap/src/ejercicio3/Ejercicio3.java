package ejercicio3;

import java.util.HashMap;
import java.util.Map;

/*3. Write a Java program to copy all of the mappings from the specified map to another map.*/
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> nuevoMap = new HashMap<>();

		nuevoMap.put(1, "UNO");
		nuevoMap.put(2, "Dos");
		nuevoMap.put(3, "Tres");
		nuevoMap.put(4, "Cuatro");
		nuevoMap.put(5, "Cinco");
		nuevoMap.put(6, "Seis");
		nuevoMap.put(7, "Siete");

		Map<Integer,String> nuevoMapa2 = new HashMap<Integer,String>(nuevoMap);
		
		for(Map.Entry m : nuevoMapa2.entrySet()) {
			System.out.println(m.getKey()+"--"+m.getValue());
		}
		
		
		HashMap<Integer, String> nuevoMapa3 = new HashMap<>();
		
		nuevoMapa3.putAll(nuevoMapa2);
		
		System.out.println(nuevoMapa3);
	}

}
