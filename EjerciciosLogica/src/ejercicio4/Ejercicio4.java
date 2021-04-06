package ejercicio4;

public class Ejercicio4 {
	private String palabra;
	
	public Ejercicio4(String palabra) {
		this.palabra = palabra;
	}
	
	public String recorreVariable() {
		String resultado = "";
		for (int i = 0; i < this.palabra.length(); i++) {
			if(this.palabra.charAt(i) == '0' || this.palabra.charAt(i) == '1' || this.palabra.charAt(i) == '2' || this.palabra.charAt(i) == '3' || this.palabra.charAt(i) == '4' || this.palabra.charAt(i) == '5' || this.palabra.charAt(i) == '6' || this.palabra.charAt(i) == '7' || this.palabra.charAt(i) == '8' || this.palabra.charAt(i) == '9'){
				resultado += this.palabra.charAt(i);
			}
		}
		return resultado;
	}
	
	public static void main (String[]argas) {
		Ejercicio4 e4 = new Ejercicio4("M3id923");
		System.out.println(e4.recorreVariable());
		
	}
}
