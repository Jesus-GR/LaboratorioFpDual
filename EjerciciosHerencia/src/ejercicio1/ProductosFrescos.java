/**
 * 
 */
package ejercicio1;

/**
 * @author jesus.maria.ramirez
 *
 */
public class ProductosFrescos extends Productos {

	private int temperaturaAmbienteRecomendada;
	
	public ProductosFrescos(String numLote,String fechaCad, String origenTipo,int temperatura) {
		super(numLote,fechaCad,origenTipo);
		this.temperaturaAmbienteRecomendada = temperatura;
		
	}
}
