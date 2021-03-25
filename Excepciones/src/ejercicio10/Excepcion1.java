package ejercicio10;

public class Excepcion1 extends Throwable{
	private String mensaje;
	
	public Excepcion1 (String mensaje) {
		this.mensaje = mensaje;
	}
}
