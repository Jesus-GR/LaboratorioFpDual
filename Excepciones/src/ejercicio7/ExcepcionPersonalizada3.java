package ejercicio7;

public class ExcepcionPersonalizada3 extends Throwable {
private String arguments;
	
	public ExcepcionPersonalizada3(String a) {
		this.arguments = a;
	}
}
