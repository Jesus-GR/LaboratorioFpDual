package ejercicio10;

public class C extends B {

	public C () {
		super();
	}
	
	@Override
	public void aBase() throws Excepcion3 {
		throw new Excepcion3("Nivel 3");
	}
}
