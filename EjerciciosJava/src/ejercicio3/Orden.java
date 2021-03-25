/**
 * 
 */
package ejercicio3;

/**
 * @author jesus.maria.ramirez
 *
 */
public class Orden {
	private String codigoCliente;
	private String codigoEmpleado;
	private String codigoOrden;
	private String fechaOrden;
	private int cantidadAticulos;
	private String direccionEnvio;
	private String estado = "creada";
	
	/****Constructor***/
	public Orden(String codigoOrden) {
		this.codigoOrden = codigoOrden;
		
	}
	
	/***Métodos***/
	
	public void cambiaEstado(String nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public void añadirNumeroArticulos(int articulosAñadidos) {
		this.cantidadAticulos += articulosAñadidos;
	}
	public void eliminarNumeroArticulos(int articulosEliminados) {
		this.cantidadAticulos -= articulosEliminados;
	}
	
	public void mostrarNumeroArticulos(){
		System.out.println(this.cantidadAticulos);
	}
	
	public String toString() {
		return "La orden "+this.codigoOrden+"está "+this.estado;
	}
		
	}

	
	

