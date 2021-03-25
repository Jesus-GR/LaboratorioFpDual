/**
 * 
 */
package ejercicio10;

/**
 * 10. Create a three-level hierarchy of exceptions. Now create a base-class A with a method that throws an exception at the base of your hierarchy. Inherit B from A and override the method so it throws an exception at level two of your hierarchy. Repeat by inheriting class C from B. In main( ), create a C and upcast it to A, then call the method.
 * 
 * 
 * 10. Cree una jerarquía de excepciones de tres niveles. Ahora cree una clase base A con un método que arroje una excepción en la base de su jerarquía. Herede B de A y anule el método para que genere una excepción en el nivel dos de su jerarquía. Repita heredando la clase C de B. En main (), cree una C y conviértala en A, luego llame al método.
 * @author jesus.maria.ramirez
 *
 */
public class Main {

	public static void main(String[]args) {
		C objetoC = new C();
		try {
			objetoC.aBase();
		}catch(Excepcion3 ex3) {
			ex3.printStackTrace();
		}
		
	}
	
}
