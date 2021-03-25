/**
 * 
 */
package ejercicio1;

/**
 * @author jesus.maria.ramirez
 *
 */
public class ProductosCongelados extends Productos {
	private int temperaturaCongelacionRecomendada;
	
	/*****Constructor*****/
	public ProductosCongelados(String numLote,String fechaCad, String origenTipo, int temperatura) {
		super(numLote,fechaCad,origenTipo);
		this.temperaturaCongelacionRecomendada = temperatura;
	}

	
	
	/*****Metodos****/
	
	public void mirarTemperatura() {
		System.out.println("La temperatura de este producto es "+getTemperaturaCongelacionRecomendada());
	}
	
	public void cambiarTemperatura(int grados) {
		setTemperaturaCongelacionRecomendada(grados);
	}
	public int getTemperaturaCongelacionRecomendada() {
		return temperaturaCongelacionRecomendada;
	}

	public void setTemperaturaCongelacionRecomendada(int temperaturaCongelacionRecomendada) {
		this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
	}
}
