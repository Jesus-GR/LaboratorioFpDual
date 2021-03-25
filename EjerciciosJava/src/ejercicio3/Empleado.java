/**
 * 
 */
package ejercicio3;

/**
 * @author jesus.maria.ramirez
 *
 */
public class Empleado {
	private String codigoEmpleado;
	private String nombre;
	private double salario;
	private int horaEntrada;
	private int horaSalida;
	
	/*****Constructor*****/
	
	public Empleado() {
		
	}
	public Empleado(String codigoEmpleado,String nombre) {
		this.codigoEmpleado = codigoEmpleado;
		this.nombre = nombre;
	}
	
	/*****Métodos****/
	
	public void ficharEntrada(int horaEntrada ) {
		this.horaEntrada = horaEntrada;
	}
	
	int[] horasMes = new int[160];
	int contadorArray = 0;
	
	
	public void ficharSalida(int horaSalida) {
		this.horaSalida = horaSalida;
		int totalHorasDia = this.horaSalida - this.horaEntrada;
		horasMes[contadorArray++] = totalHorasDia;
		
		
		System.out.println("El numero de horas trabajadas hoy ha sido de "+totalHorasDia+" horas");
	}
	
	public void calcularSalario(int precioHora) {
		int totalHoras = 0;
		for (int i = 0; i < contadorArray; i++) {
			totalHoras += horasMes[i];
		}
		
		this.salario = totalHoras * precioHora;
		System.out.println(this.salario);
	}
	
	public void enviar(String pedido) {
		System.out.println("El artífulo "+pedido+"ha sido enviado");
	}
	
	public String toString() {
		return"Empleado "+this.nombre;
	}
	
}
