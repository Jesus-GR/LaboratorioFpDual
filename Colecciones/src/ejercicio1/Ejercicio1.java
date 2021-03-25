package ejercicio1;

public class Ejercicio1 {
	public static void main (String[]args) {
		int[] arrayMain = {5,2,3,6};
		System.out.print(Ejercicio1.contiene6(arrayMain));
	}
	
	public static boolean contiene6(int[] array){
		if(array[0] == 6 || array[array.length-1] == 6) {
			return true;
		}else {
		return false;
		}
		
	}
}
