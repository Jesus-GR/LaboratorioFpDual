/**
 * 
 */
package ejercicio7;

/**
 * @author jesus.maria.ramirez
 *
 */
public class ExcepcionPersonalizada1 extends Exception {
	private String arguments;
	
	public ExcepcionPersonalizada1(String a) {
		this.arguments = a;
	}
}

