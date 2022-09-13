
public class VendingMachine {
	private double beer, coke, greenTea;
	private double Q, T, F, N; // Coin Type
	private double change;
	
	// constructor
	public VendingMachine() {
		beer = 3.00;
		coke = 1.00;
		greenTea = 5.00;
		
		Q = 0.10;
		T = 0.20;
		F = 0.50;
		N = 1.00;
		
		change = 0;
	}
	
	// get the drink selection, and return the cost of the drink
	public double selectDrink(int choice) {
		switch (choice) {
		case 1:
			return beer;
		case 2:
			return coke;
		case 3:
			return greenTea;
		default:
			return 0;
		}
	}
	
	// insert the coins and and returns the amount inserted
	public double insertCoins(char inputCoin) {
		switch (inputCoin) {
		case 'Q':
			return Q;
		case 'T':
			return T;
		case 'F':
			return F;
		case 'N':
			return N;
		default:
			return 0;
		}
	}
	
	// check the change and print the change on screen
	public void checkChange(double totalAmountUserEntered, double drinkCost) {
		change = totalAmountUserEntered - drinkCost;
		System.out.println("totalAmountUserEntered: $" + totalAmountUserEntered);
		System.out.println("drinkCost: $" + drinkCost);
		System.out.println("Change: $" + change);
	}
	
	// print the receipt and collect the drink
	public void printReceipt() {
		System.out.println("Please collect your drink");
		System.out.println("Thank You !!");
	}
}
