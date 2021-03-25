/**
 * 
 */
package ejercicio4;

/**
 * @author jesus.maria.ramirez
 *
 */
public class Ejercicio4 {

	public static void main (String[]args) {
		int[] arrayOriginal = {1,2,3,4,5,6};
		int [] nuevoArray = Ejercicio4.devuelveValoresInvertidos(arrayOriginal);
		
		for (int i : arrayOriginal) {
			System.out.print(i);
		}
		System.out.println();
		for (int i : nuevoArray) {
			System.out.print(i);
		}
	}
	
	public static int[] devuelveValoresInvertidos (int[] arrayMetodo) {
		int[] nuevoArray = new int[arrayMetodo.length];
		int contadorNuevoArray = 0;
		for (int i = nuevoArray.length-1; i >= 0 ; i--) {
			nuevoArray[contadorNuevoArray++] = arrayMetodo[i];
		}
		return nuevoArray;
	}
}
