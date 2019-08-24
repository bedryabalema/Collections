//how to create a user defined Exception(custom Exception) eg. for election 
public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super();
	}
	public InvalidAgeException(String msg) {
		super(msg);
		
	}

}
