
public class Q3FinallyDemo {
	public static void main(String[] args) {
		try {
			System.out.println("Output for argument 99: ");
			sampleMethod(99);
		}
		catch (Exception e) {
			System.out.println("Caught in main.");
		}
		
		try {
			System.out.println("\nOutput for argument -99: ");
			sampleMethod(-99);
		}
		catch (Exception e) {
			System.out.println("Caught in main.");
		}
		
		try {
			System.out.println("\nOutput for argument 0: ");
			sampleMethod(0);
		}
		catch (Exception e) {
			System.out.println("Caught in main.");
		}
	}
	
	public static void sampleMethod(int n) throws Exception {
		try {
			if (n > 0) {
				throw new Exception();
			}
			else if (n < 0) {
				throw new Q3NegativeNumberException();
			}
			else {
				System.out.println("No Exception.");
			}
			System.out.println("Still in sampleMethod.");
		}
		catch (Q3NegativeNumberException e) {
			System.out.println("Caught in sampleMethod");
		}
		finally {
			System.out.println("In finally block.");
		}
		System.out.println("After finally block.");
	}
}
