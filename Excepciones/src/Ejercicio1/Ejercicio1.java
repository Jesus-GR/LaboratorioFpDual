/**
 * 
 */
package Ejercicio1;

/**
 * 1. Create a class with a main( ) that throws an object of class Exception inside a try block. Give the constructor for Exception a String argument. Catch the exception inside a catch clause and print the String argument. Add a finally clause and print a message to prove you were there.
 * 
 * @author jesus.maria.ramirez
 *
 */
public class Ejercicio1 {
	private int numerador;
	private int denominador;
	
	public Ejercicio1(int numerador, int denominador) {
		this.numerador =  numerador;
		this.denominador = denominador;
	}
	
	public int dividir() {
		int resultado = 0 ;
		return resultado = this.numerador/this.denominador;
	}
	
	public static void main(String[]args) {
		Ejercicio1 e1 = new Ejercicio1 (4,4);
		try {
			e1.dividir();
		}catch(Exception e) {
			System.out.println("Error al dividir entre 0");
		}finally {
			if(e1.denominador == 0) {
				System.out.println("No se puede dividir entre 0 ");
			}else {
				System.out.println("El resultado es "+e1.dividir());
			}
			
		}
	}
}
