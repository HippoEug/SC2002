import java.util.Scanner;

public class Q4CalculatorEx {
	private double result;
	private double precision = 0.0001;
	// numbers close to 0 treated as if equal to zero
	
	public static void main(String[] args) {
		Q4CalculatorEx calculator = new Q4CalculatorEx();
		
		try {
			System.out.println("Calculator is on");
			calculator.doCalculation();
		}
		catch (Q4UnknownOperatorException e) {
			calculator.handleUnknownException(e);
		}
		catch (Exception e) {
			System.out.println("Other Exception " + e.getMessage());
		}
		
		System.out.println("Final result = " + calculator.resultValue());
		System.out.println("End of program");
	}
	
	public Q4CalculatorEx() {
		result = 0;
	}
	
	// return the result
	public double resultValue() {
		return result;
	}
	
	// perform the calculation
	public void doCalculation() throws ArithmeticException, Q4UnknownOperatorException {
		char nextOp; // + - * / 
		double nextNumber; // numbers
		boolean done = false; // for Q/q to quit program
		Scanner sc = new Scanner(System.in);
		
		System.out.println("result = " + result);
		while (!done) {
			System.out.println("Enter + - * / or Q/q to quit");
			String nextOpStr = sc.next();
			nextOp = nextOpStr.charAt(0);
			
			if ((nextOp == 'Q') || (nextOp == 'q')) {
				done = true;
			}
			else {
				System.out.println("Enter the number > ");
				nextNumber = sc.nextDouble();
				result = evaluate(nextOp, result, nextNumber);
				
				System.out.println("result " + nextOp + " " + nextNumber + " = " + result);
				System.out.println("updated result = " + result);
			}
		}
	}
	
	// evaluate computation
	public double evaluate(char op, double n1, double n2) throws ArithmeticException, Q4UnknownOperatorException {
		double answer;
		
		switch (op) {
			case '+':
				answer = n1 + n2;
				break;
				
			case '-':
				answer = n1 - n2;
				break;
				
			case '*':
				answer = n1 * n2;
				break;
				
			case '/':
				if ((-precision < n2) && (n2 < precision)) {
					throw new ArithmeticException();
				}
				answer = n1 / n2;
				break;
				
			default:
				throw new Q4UnknownOperatorException(op);
		}
		
		return answer;
	}
	
	// handle unknown operator exception and ask user to reenter data again
	public void handleUnknownException(Q4UnknownOperatorException e) {
		System.out.println(e.getMessage());
		System.out.println("Please reenter: ");
		
		try {
			doCalculation();
		}
		catch (Q4UnknownOperatorException e2) {
			System.out.println(e2.getMessage());
			System.out.println("Try again later");
			System.out.println("End of Program");
			System.exit(0);
		}
	}
}
