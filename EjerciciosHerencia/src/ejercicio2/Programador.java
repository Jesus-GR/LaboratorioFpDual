/**
 * 
 */
package ejercicio2;

/**
 * @author jesus.maria.ramirez
 *
 */
public class Programador extends Empleado {
	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;

	/****** Constructor ****/

	public Programador() {
		super();
	}

	public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineas,
			String lenguaje) {
		super(nombre, cedula, edad, casado, salario);
		this.lenguajeDominante = lenguaje;
		this.lineasDeCodigoPorHora = lineas;
	}
	
	/*****Métodos****/
	@Override
	public String toString() {
		return "Nombre y apellidos: "+this.getNombre()+"\nCédula: "+this.getCedula()+"\nEdad: "+this.getEdad()+"\nCasado: "+this.isCasado()+"\nSalario: "+this.getSalario()+" €\nLenguaje dominante:  "+this.lenguajeDominante+"\nLineas por hora: "+this.lineasDeCodigoPorHora;
	}
}
