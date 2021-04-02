package ejercicio24_tailMapBoolean;
/*24. Write a Java program to get a portion of a map whose keys are greater than to a given key. */
import java.util.TreeMap;

public class Ejercicio24 {

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
		System.out.println(color.tailMap(3, false));

	}

}
