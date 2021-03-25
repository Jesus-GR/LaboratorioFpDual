/**
 * 
 */
package ejercicio2;

/**
 * @author jesus.maria.ramirez
 *
 */
public class PruebaEmpleados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado e1 = new Empleado("Jesús Gutiérrez Ramírez", "No se que coño es", 28, false, 1500);
		System.out.println(e1);
		System.out.println();
		e1.aumentarSalario(10);
		System.out.println(e1);
		Programador p1 = new Programador("Antonio", "Npi", 23, true, 1800, 20, "Java") ;
		
		System.out.println(p1.mostrarClasificacion());
		p1.aumentarSalario(5);
		System.out.println(p1);
	
			
		}
		
	

}
