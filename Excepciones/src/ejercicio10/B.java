package ejercicio10;

/**
 * 10. Cree una jerarquía de excepciones de tres niveles. Ahora cree una clase
 * base A con un método que arroje una excepción en la base de su jerarquía.
 * Herede B de A y anule el método para que genere una excepción en el nivel dos
 * de su jerarquía. Repita heredando la clase C de B. En main (), cree una C y
 * conviértala en A, luego llame al método.
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
