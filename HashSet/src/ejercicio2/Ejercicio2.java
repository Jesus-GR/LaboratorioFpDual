/**
 * 
 */
package ejercicio2;

/*2. Write a Java program to iterate through all elements in a hash list.*/
import java.util.HashSet;

/**
 * @author jesus.maria.ramirez
 *
 */
public class Ejercicio2 {

	public static void main (String[]args) {

		HashSet<Integer> nuevaLista = new HashSet<>();
		
		nuevaLista.add(1);
		nuevaLista.add(2);
		nuevaLista.add(3);
		nuevaLista.add(4);
		nuevaLista.add(5);
		
		for (Integer i : nuevaLista) {
			System.out.println(i);
		}
		
	}
}
