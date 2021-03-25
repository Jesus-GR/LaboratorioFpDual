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
	
	/***M�todos***/
	
	public void cambiaEstado(String nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public void a�adirNumeroArticulos(int articulosA�adidos) {
		this.cantidadAticulos += articulosA�adidos;
	}
	public void eliminarNumeroArticulos(int articulosEliminados) {
		this.cantidadAticulos -= articulosEliminados;
	}
	
	public void mostrarNumeroArticulos(){
		System.out.println(this.cantidadAticulos);
	}
	
	public String toString() {
		return "La orden "+this.codigoOrden+"est� "+this.estado;
	}
		
	}

	
	

