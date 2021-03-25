/**
 * 
 */
package ejercicio4;

/**
 * 4. Define an object reference and initialize it to null. Try to call a method through this reference. Now wrap the code in a try-catch clause to catch the exception.
 * @author jesus.maria.ramirez
 *
 */
public class Object {
 private String valor;
	public Object(String valor) {
		this.valor = valor;
	}
	
	public void cambioValor() throws NumberFormatException{
		if(this.valor != null) {
			this.valor = "";
		}else {
			throw new NumberFormatException();
		}
		
	}
	public static void main (String[]args) {
		Object o1 = new Object(null);
		
		try {
			o1.cambioValor();
		}catch(NumberFormatException nu) {
			System.out.println("No se que tengo que  hacer");
		}
	}
}
