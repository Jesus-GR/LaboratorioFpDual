package ejercicio8;

/**
 * 8. Write code to generate and catch an ArrayIndexOutOfBoundsException.
 * 
 * @author jesus.maria.ramirez
 *
 */
public class Ejercicio8 {
	
	public static void main(String[] args) {
		int[] arrayEnteros = new int[5];
		int valorArray = 1;
		try {
			for (int i = 0; i < arrayEnteros.length+1; i++) {
				arrayEnteros[i] = valorArray++;
			}

		} catch (IndexOutOfBoundsException IndexOutOfBoundsException) {
			IndexOutOfBoundsException.printStackTrace();
			System.out.println("Error en el índice del array");
			
		}

		for (int i : arrayEnteros) {
			System.out.print(i + ", ");
		}
		
	}
	
}
