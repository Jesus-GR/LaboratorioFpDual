package ejercicio7;

public class ExcepcionPersonalizada2 extends Exception{
private String arguments;
	
	public ExcepcionPersonalizada2(String a) {
		this.arguments = a;
	}
}
