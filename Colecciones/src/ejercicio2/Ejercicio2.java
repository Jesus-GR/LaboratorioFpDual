/**
 * 
 */
package ejercicio2;

/**
 * @author jesus.maria.ramirez
 *
 */
public class Ejercicio2 {

	public static void main(String[]args) {
		int[] arrayPrueba = {1,4,5};
		System.out.println(Ejercicio2.contiene2o3(arrayPrueba));
	}
	public static boolean contiene2o3 (int[]arrayMetodo) {
		int contador = 0;
		for (int i = 0; i < arrayMetodo.length; i++) {
			if(arrayMetodo[i] == 2 || arrayMetodo[i] == 3) {
				contador++;
			}
		}
		if(contador == 0) {
			return true;
		}else {
			return false;
		}
	}
}
