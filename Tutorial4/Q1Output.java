
public class Q1Output {
	public static void main(String[] args) {
		int waitTime = 46;
		System.out.println("Output for waitTime = " + waitTime);
		try {
			System.out.println("Try block entered");
			if (waitTime > 30) {
				throw new Exception("Time Limit Exceeded");
			}
			System.out.println("Leaving try block");
		}
		catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		System.out.println("After catch block");
		
		waitTime = 12;
		System.out.println("\nOutput for waitTime = " + waitTime);
		try {
			System.out.println("Try block entered");
			if (waitTime > 30) {
				throw new Exception("Time Limit Exceeded");
			}
			System.out.println("Leaving try block");
		}
		catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		System.out.println("After catch block");
	}
}
