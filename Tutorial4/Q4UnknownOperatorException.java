
public class Q4UnknownOperatorException extends Exception {
	public Q4UnknownOperatorException() {
		super("UnknownOperatorException");
	}
	
	public Q4UnknownOperatorException(char op) {
		super(op + " is an unknown operator.");
	}
	
	public Q4UnknownOperatorException(String message) {
		super(message);
	}
}
