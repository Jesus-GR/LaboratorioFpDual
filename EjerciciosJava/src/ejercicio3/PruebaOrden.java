/**
 * 
 */
package ejercicio3;

/**
 * @author jesus.maria.ramirez
 *
 */
public class PruebaOrden {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orden o1 = new Orden("12345");
		o1.mostrarNumeroArticulos();
		o1.añadirNumeroArticulos(10);
		o1.mostrarNumeroArticulos();
		o1.eliminarNumeroArticulos(4);
		o1.mostrarNumeroArticulos();
	}

}
