package ejercicio3;

public class Ejercicio3 {
	public static void main(String[]args) {
		int [] arrayFuncion = {1,2,3,4};
		
		int[] arrayMain = Ejercicio3.contieneValoresCentrales(arrayFuncion);
		for (int i : arrayMain) {
			System.out.println(i);
		}
	}

	public static int[]contieneValoresCentrales(int[]arrayInicial){
		int[] nuevoArray = new int[2];
		if(arrayInicial.length % 2 != 0) {
			System.out.println("El array debe de ser par");
			return null;
		}else {
			int contadorNuevoArray = 0;
			for (int i = (arrayInicial.length/2)-1; i <= (arrayInicial.length/2); i++) {
				nuevoArray[contadorNuevoArray++] = arrayInicial[i];
			}
			return nuevoArray;
		}
		
	}
}
