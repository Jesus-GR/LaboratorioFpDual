/**
 * 
 */
package ejercicio2;

/**
 * @author jesus.maria.ramirez
 *
 */
public class PruebaEmpleado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado e1 = new Empleado("20982","Jose");
		System.out.println(e1);
		e1.ficharEntrada(8);
		e1.ficharSalida(20);
		e1.ficharEntrada(9);
		e1.ficharSalida(20);
		
		e1.calcularSalario(7);
	}

}
