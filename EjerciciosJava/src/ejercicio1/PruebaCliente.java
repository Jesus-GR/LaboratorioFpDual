/**
 * 
 */
package ejercicio1;

/**
 * @author jesus.maria.ramirez
 *
 */
public class PruebaCliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("2987","Federico", 30, "Calle 1...");
		System.out.println(c1);

		c1.añadirSaldo(130);
		c1.mostrarSaldo();
		c1.comprar("Juego", 59);
		c1.mostrarSaldo();
		c1.comprar("Mando", 32.99);
		c1.comprar("Cable", 10);
		System.out.println();
		c1.mostrarSaldo();
		c1.mostrarHistorial();
		c1.devolverArticulo("Mando", 32.99);
		System.out.println();
		c1.mostrarSaldo();
		c1.mostrarHistorial();
		c1.devolverArticulo("Juego", 59);
		System.out.println();
		c1.mostrarSaldo();
		c1.mostrarHistorial();
		c1.añadirSaldo(500);
		c1.comprar("Play", 399);
		System.out.println();
		c1.mostrarSaldo();
		c1.mostrarHistorial();
	}

}
