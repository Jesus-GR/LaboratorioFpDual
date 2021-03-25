/**
 * 
 */
package ejercicio1;

/**
 * @author jesus.maria.ramirez
 *
 */
public class Empresa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductosFrescos pc1 = new ProductosFrescos("1234", "08/09/2022", "animal", -10);
		System.out.println(pc1);
		pc1.modificarStock(30);
		pc1.controlStock();
		pc1.modificarStock(30);
		pc1.controlStock();
		pc1.enviar("barco", 20);
		pc1.controlStock();
	}

}
