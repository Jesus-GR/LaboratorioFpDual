/**
 * 
 */
package ejercicio7;

/**
 * @author jesus.maria.ramirez
 *
 */
public class Elemento {
	private String etiqueta;
	private String contenido;
	
	public Elemento(String etiqueta, String contenido) {
		this.etiqueta = etiqueta;
		this.contenido = contenido;
	}
	
	public String toString() {
		
		return "<"+this.etiqueta+"> "+this.contenido+" </"+this.etiqueta+">";
	}
	public static void main(String[]args) {
		Elemento e1 = new Elemento("titulo","ejercicio");
		System.out.println(e1);
	}
}
