package ejercicio3;

public class Ejercicio3 {
	private static int cuentaInstancias = 0;
	
	public Ejercicio3() {
		cuentaInstancias ++;
	}
	public static void main(String[]args) {
		Ejercicio3 e1 = new Ejercicio3();
		Ejercicio3 e2 = new Ejercicio3();
		Ejercicio3 e3 = new Ejercicio3();
		Ejercicio3 e4 = new Ejercicio3();
		
		System.out.println(cuentaInstancias);
	}
}
