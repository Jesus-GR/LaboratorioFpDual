/**
 * 
 */
package ejercicio1;

/**
 * @author jesus.maria.ramirez
 *
 */
public abstract class Productos {
	private String numLote;
	private String fechaCaducidad, origenTipo;
	private String estado = "en almacen";
	private int stock = 0;

	/***** Constructor ****/
	public Productos(String numLote, String fechaCad, String origenTipo) {
		this.numLote = numLote;
		this.fechaCaducidad = fechaCad;
		this.origenTipo = origenTipo;
	}

	/**** Metodos ****/
	public String toString() {
		return "El  producto con número " + this.numLote + " tiene fecha de caducidad " + this.fechaCaducidad
				+ " y es de origen " + this.origenTipo + " se encuentra " + this.estado;
	}

	public void enviar(String medio, int cantidadEnviada) {
		this.estado = "enviado";
		this.stock -= cantidadEnviada;
		if (medio.equals("barco")) {
			System.out.println("El producto tardará entre 20 y 40 días en llegar a su destino");
		} else if (medio.equals("avion")) {
			System.out.println("El producto tardará entre 3 y 7 días en llegar a su destino");
		}
		System.out.println("Se envian "+cantidadEnviada+" unidades");
	}
	
	
	public void modificarStock(int cantidad) {
		this.stock += cantidad;
	}
	public void controlStock() {
		System.out.println("El stock del producto con "+numLote+" es "+getStock()+" unidades");
	}
/****Getters y setters****/

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	

}
