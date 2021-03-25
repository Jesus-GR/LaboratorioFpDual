/**
 * 
 */
package ejercicio2;
import java.util.Scanner;
/**Create your own exception class using the extends keyword. Write a constructor for this class that takes a String argument and stores it inside the object with a String reference. Write a method that prints out the stored String. Create a try-catch clause to exercise your new exception.
 * @author jesus.maria.ramirez
 *
 */
public class PersonalException extends Exception {
	private  String message;
	
	public PersonalException(String argument) {
		super(argument);
		this.message = "Error "+ argument;
		
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
	@Override
	 public void printStackTrace() {
		System.out.println(getMessage());
	}
	
	
	
}

