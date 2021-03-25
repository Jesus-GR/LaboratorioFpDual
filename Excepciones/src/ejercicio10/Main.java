/**
 * 
 */
package ejercicio10;

/**
 * 10. Create a three-level hierarchy of exceptions. Now create a base-class A with a method that throws an exception at the base of your hierarchy. Inherit B from A and override the method so it throws an exception at level two of your hierarchy. Repeat by inheriting class C from B. In main( ), create a C and upcast it to A, then call the method.
 * 
 * 
 * 10. Cree una jerarqu�a de excepciones de tres niveles. Ahora cree una clase base A con un m�todo que arroje una excepci�n en la base de su jerarqu�a. Herede B de A y anule el m�todo para que genere una excepci�n en el nivel dos de su jerarqu�a. Repita heredando la clase C de B. En main (), cree una C y convi�rtala en A, luego llame al m�todo.
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
