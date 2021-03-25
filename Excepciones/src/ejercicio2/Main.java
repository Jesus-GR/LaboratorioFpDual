package ejercicio2;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		
		try {
		int numeroIntroducido = Integer.parseInt(s.nextLine());
		Prueba p1 = new Prueba(numeroIntroducido);
			if(numeroIntroducido > 10) {
				throw new PersonalException("El numero introducido debe ser menor a 10");
			}
		}catch(PersonalException error) {
			error.printStackTrace();
			System.out.println("Debe introducirse un numero: "+ error.getMessage());
		}
		
	}
}
