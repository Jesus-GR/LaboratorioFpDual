/**
 * 
 */
package ejercicio3;
import java.util.Scanner;



/**
 * 3. Write a class with a method that throws an exception of the type created in Exercise 2. Try compiling it without an exception specification to see what the compiler says. Add the appropriate exception specification. Try out your class and its exception inside a try-catch clause.
 * @author jesus.maria.ramirez
 *
 */
public class Ejercicio3Main {
	private double saldo;

	private Ejercicio3Main (int saldo) {
		this.saldo = saldo;
		}
		
		public void comprar (int precio) {
			if(precio > this.saldo) {
			}else {
				this.saldo -= precio;
			}
			
	}
		public String toString() {
			return "La cuenta tiene un saldo de "+this.saldo;
		}
		
		
		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public static void main (String[]args) {
			Scanner s = new Scanner(System.in);
			Ejercicio3Main e3 = new Ejercicio3Main(1000);
		
			try {
				System.out.println(e3);
				System.out.println("Introduzca el importe que desea gastar: ");
				int importe = Integer.parseInt(s.nextLine());
				e3.comprar(importe);
				throw new PersonalException("El saldo no puede estar en negativo");
			}catch(PersonalException error) {
				error.printStackTrace();
				
				
			}
			
			
		}
	
}
