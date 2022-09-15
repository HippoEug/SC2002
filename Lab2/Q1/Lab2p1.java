import java.util.Scanner;
import java.lang.Math;

public class Lab2p1 {
	public static void main(String[] args) {
		int choice;
		int m, n;
		int answer;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\nPerform the following methods:");
			System.out.println("1: multiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1: // add mulTest() call
				mulTest();
				break;
				
			case 2: // add divide() call
				System.out.print("Enter Positive Integer Dividend m: ");
				m = sc.nextInt();
				System.out.print("Enter Positive Integer Divisor n: ");
				n = sc.nextInt();
				
				answer = divide(m, n);
				System.out.println(m + " / " + n + " = " + answer);
				break;
				
			case 3: // add modulus() call
				System.out.print("Enter Positive Integer Dividend m: ");
				m = sc.nextInt();
				System.out.print("Enter Positive Integer Divisor n: ");
				n = sc.nextInt();
				
				answer = modulus(m, n);
				System.out.println(m + " % " + n + " = " + answer);
				break;
				
			case 4: // add countDigits() call
				System.out.print("Enter Positive Integer n: ");
				n = sc.nextInt();
				
				if (n < 0) {
					System.out.println("n: " + n + " - Error Input!");
				}
				else {
					answer = countDigits(n);
					System.out.println("n: " + n + " - count = " + answer);
				}
				break;
				
			case 5: // add position() call
				System.out.print("Enter a Positive Number n: ");
				n = sc.nextInt();
				System.out.print("Enter a Digit to Find: ");
				int digit = sc.nextInt();
				
				answer = position(n, digit);
				System.out.println("position = " + answer);
				break;
				
			case 6: // add extractOddDigits() call
				System.out.print("Enter a Positive Number n: ");
				int longN = sc.nextInt();
				
				if (longN < 0) {
					System.out.println("oddDigits = Error Input!!");
				}
				else {
					long longAnswer = extractOddDigits(longN);
					System.out.println("oddDigits = " + longAnswer);
				}
				break;
				
			case 7: 
				System.out.println("Program terminating ....");
			}
			
		} while (choice != 7);
	}
	
	public static void mulTest() {
		int num1, num2, userInput;
		int score = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			num1 = (int)(Math.random() * 10) + 1;
			num2 = (int)(Math.random() * 10) + 1;
			
			System.out.print("How much is " + num1 + " times " + num2 + "? ");
			userInput = sc.nextInt();
			if (userInput == (num1*num2)) {
				score++;
			}
		}
		System.out.println(score + " answers out of 5 are correct.");
	}
	
	public static int divide(int m, int n) {
		int count = 0;
		
		while (m >= n) {
			m = m - n;
			count++;
		}
		
		return count;
	}
	
	public static int modulus(int m, int n) {
		while (m >= n) {
			m = m- n;
		}
		
		return m;
	}
	
	public static int countDigits(int n) {
		int digitCount = 0;
		
		while (n > 0) {
			n = n/10;
			digitCount++;
		}
		
		return digitCount;
	}
	
	public static int position(int n, int digit) {
		int lastDigit;
		int foundDigitPosition = -1;
		int currentPosition = 1;
		
		while (n > 0) {
			lastDigit = n%10;
			if (lastDigit == digit) {
				foundDigitPosition = currentPosition;
				return foundDigitPosition;
			}
			n = n/10;
			currentPosition++;
		}
		return -1;
	}
	
	public static long extractOddDigits(long n) {
		long lastDigit;
		long newNumber = 0;
		long positionalWeight = 1;
		
		while (n > 0) {
			lastDigit = n%10;
			if (lastDigit % 2 == 1) {
				newNumber = newNumber + (lastDigit*positionalWeight);
				positionalWeight = positionalWeight*10;
			}
			n = n/10;
		}
		
		if (newNumber == 0) {
			return -1;
		}
		else {
			return newNumber;
		}
	}
}
