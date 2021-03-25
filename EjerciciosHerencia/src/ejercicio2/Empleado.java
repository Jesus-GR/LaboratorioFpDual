/**
 * 
 */
package ejercicio2;

/**
 * @author jesus.maria.ramirez
 *
 */
public class Empleado {
/****Atributos*****/
	private String nombre;
	private String cedula;
	private int edad;
	private boolean casado;
	private double salario;

	/*****Constructor****/
	public Empleado() {}
	
	public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;		
	}
	/*****Métodos*****/
	public String mostrarClasificacion() {
		if(this.edad <=21) {
			return "Principiante";
		}else if(this.edad >=22 && this.edad <=35) {
			return "Intermedio";
		}else if(this.edad > 35) {
			return "Senior";
		}else {
			return "";
		}
		
	}
	
	public void aumentarSalario(int porcentaje) {
		this.salario += (this.salario*porcentaje)/100;
	}
	
	public String toString() {
		return "Nombre y apellidos: "+this.nombre+"\nCédula: "+this.cedula+"\nEdad: "+this.edad+"\nCasado: "+this.casado+"\nSalario: "+this.salario+" €";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
