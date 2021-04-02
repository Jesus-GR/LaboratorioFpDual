package ejercicio10;

import java.util.HashSet;

/*10. Write a Java program to compare two hash set.*/
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> nuevaLista = new HashSet<>();

		nuevaLista.add(1);
		nuevaLista.add(2);
		nuevaLista.add(3);
		nuevaLista.add(4);
		nuevaLista.add(5);
		nuevaLista.add(6);
		System.out.println(nuevaLista);
		
		HashSet<Integer> nuevaLista2 = new HashSet<>();
		nuevaLista2.add(1);
		nuevaLista2.add(9);
		nuevaLista2.add(8);
		nuevaLista2.add(3);
		nuevaLista2.add(5);
		nuevaLista2.add(6);
		System.out.println(nuevaLista2);
		
		for (Integer integer : nuevaLista2) {
			if(nuevaLista.contains(integer)) {
				System.out.println("Si");
			}else {
				System.out.println("No");
			}
		}
		
		
	}

}
