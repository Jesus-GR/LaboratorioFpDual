package ejercicio10;

/**
 * 10. Cree una jerarqu�a de excepciones de tres niveles. Ahora cree una clase
 * base A con un m�todo que arroje una excepci�n en la base de su jerarqu�a.
 * Herede B de A y anule el m�todo para que genere una excepci�n en el nivel dos
 * de su jerarqu�a. Repita heredando la clase C de B. En main (), cree una C y
 * convi�rtala en A, luego llame al m�todo.
 * 
 * @author jesus.maria.ramirez
 *
 */
public class B extends A {
	public B() {
		super();
	}
	
	@Override
	public void  aBase() throws Excepcion2{
		throw new Excepcion2("Nivel2");
	}
}
