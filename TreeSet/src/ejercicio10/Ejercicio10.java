package ejercicio10;

import java.util.TreeSet;

/*10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.*/
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> numero = new TreeSet<>();
		TreeSet<Integer> nuevoNumero = new TreeSet<>();
		numero.add(1);
		numero.add(2);
		numero.add(3);
		numero.add(4);
		numero.add(6);
		numero.add(7);
		numero.add(8);
		numero.add(9);
		
		//nuevoNumero = (TreeSet) numero.tailSet(7);
		
		
		System.out.println(numero.ceiling(5));
		/*El método ceiling te da un valor igual o mayor que el numero que pones como valor.
		 * El número no está en el treeSet pero te da el igual o mayor que haya en la lista*/

	}

}
