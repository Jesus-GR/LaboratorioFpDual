package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
	/**
	 * 9. Create your own resumption-like behavior by using a while loop that
	 * repeats until an exception is no longer thrown.
	 */

	private int saldo;

	public Ejercicio9(int saldo) {
		this.saldo = saldo;
	}

	public int gastar(int dinero) {
		if (dinero > this.saldo) {
			throw new ArithmeticException();
		} else {
			return this.saldo -= dinero;
		}
	}

	public String toString() {
		return "Te quedan " + this.saldo + " en la cuenta";
	}

	public int getSaldo() {
		return saldo;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Ejercicio9 e9 = new Ejercicio9(1500);
		int gasto = 0;
		do {System.out.println(e9);
			System.out.print("Introduce cuanto quieres gastar: ");
			gasto = Integer.parseInt(s.nextLine());
			try {
				e9.gastar(gasto);
			} catch (ArithmeticException ArithmeticException) {
				ArithmeticException.printStackTrace();
				System.out.println("No puedes gastar más del saldo que tienes");
			}
			System.out.println();
		} while (e9.getSaldo()> 0);
		System.out.println("Te has quedado sin dinero");
		System.out.println(e9);

	}

}
