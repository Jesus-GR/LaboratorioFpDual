/**
 * 
 */
package ejercicio7;

/**
 * 7. Create three new types of exceptions. Write a class with a method that
 * throws all three. In main( ), call the method but only use a single catch
 * clause that will catch all three types of exceptions.
 * 
 * @author jesus.maria.ramirez
 *
 */
public class Main {
	private double numero1;
	private double numero2;

	public Main(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public String toString() {
		return "" + this.numero1 + " , " + this.numero2;
	}

	public double dividir() throws ExcepcionPersonalizada1,ExcepcionPersonalizada2, ExcepcionPersonalizada3{
		double resultado = this.numero1/this.numero2;
		if(this.numero2 == 0) {
			throw new ExcepcionPersonalizada1("No se puede dividir entre 0");
		}
		return resultado;
			
	}

	public static void main(String[] args) {
		Main m1 = new Main(3, 0);
		Main m2 = new Main(0, 0);
		Main m3 = new Main(0, 0);
		try {
			m1.dividir();
			System.out.println(m3);
		} catch (ExcepcionPersonalizada1 | ExcepcionPersonalizada2 | ExcepcionPersonalizada3 exp) {
			exp.printStackTrace();
			exp.getMessage();
		}

	}

}
