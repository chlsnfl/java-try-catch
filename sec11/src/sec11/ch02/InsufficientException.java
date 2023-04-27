package sec11.ch02;

public class InsufficientException extends Exception{

	public InsufficientException() {}
	public InsufficientException(String message) {
		super(message);
	}
}
