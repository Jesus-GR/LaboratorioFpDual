/**
 * 
 */
package ejercicio5;

/**
 * @author jesus.maria.ramirez
 *
 */
public class ImprimirParametros {
	private String palabra;
	private int repeticiones;
	
	public ImprimirParametros(String palabra, int repeticiones) {
		this.palabra = palabra;
		this.repeticiones = repeticiones;
	}
	
	public String toString() {
		
		for (int i = 0; i < this.repeticiones-1; i++) {
			System.out.println(this.palabra);
		}
		return this.palabra;
		
	}
}
