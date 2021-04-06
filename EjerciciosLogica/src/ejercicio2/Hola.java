package ejercicio2;

public class Hola {
	private String nombreEstudiante;
	private String parametro;

	/**** Constructor ****/

	public Hola(String nombreEstudiante) {
		int contadorNumeros = 0;
		for (int i = 0; i < nombreEstudiante.length(); i++) {
			if(nombreEstudiante.charAt(i) == '0' ||nombreEstudiante.charAt(i) == '1' ||nombreEstudiante.charAt(i) == '2' ||nombreEstudiante.charAt(i) == '3' ||nombreEstudiante.charAt(i) == '4' ||nombreEstudiante.charAt(i) == '5' ||nombreEstudiante.charAt(i) == '6' ||nombreEstudiante.charAt(i) == '7' ||nombreEstudiante.charAt(i) == '8' ||nombreEstudiante.charAt(i) == '9' ) {
				contadorNumeros++;
			}
		}
		
		if(contadorNumeros == 0) {
			this.nombreEstudiante = nombreEstudiante;
		}else {
			System.out.println("el nombre del estudiante no puede contener números");
			this.nombreEstudiante = "";
		}
		
		
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
