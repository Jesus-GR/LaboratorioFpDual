package ejercicio1;

public class Hola {
	private String nombreEstudiante;
	private String parametro;

	/**** Constructor ****/

	public Hola(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	/*** Métodos ***/

	public String toString() {
		return "Hola " + this.nombreEstudiante;
	}

	public static void main(String[] args) {
		Hola h1 = new Hola("Antonio");

		System.out.println(h1);
	}
}
