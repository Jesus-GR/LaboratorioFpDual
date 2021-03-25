package ejercicio5;

import com.sun.jdi.Method;

/**
 * 5. Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define. In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception (of a second type that you define). Test your code in main( ).
 */

public class Ejercicio5Clase {

	public Ejercicio5Clase() {
		
	}
	
	public  boolean  f()  {
		
		
	}
	public   boolean g() throws NewException {
		throw new NewException("Adios");
		
	}
	public static void main (String[]args) {
		Ejercicio5Clase e5 = new Ejercicio5Clase();
		
		try {
			if(e5.g()) {
				new NewException("error g");
			}else if (e5.f()){
				new NumberFormatException();
			}
			
			
		}catch(NewException nE) {
			nE.printStackTrace();
			nE.getMessage();
			System.out.println("NewException");
		}catch(NumberFormatException error) {
			error.printStackTrace();
			System.out.println("NumberFormatException");
		}
	}
	
}
