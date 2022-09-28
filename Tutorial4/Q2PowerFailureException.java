
public class Q2PowerFailureException extends Exception {
	public Q2PowerFailureException() {
		super("Power Failure!");
	}
	public Q2PowerFailureException(String message) {
		super(message);      
	}
}
