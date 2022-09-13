import java.util.Scanner;

public class VendingMachineApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userOption;
		char coinInput;
		double drinkCost = 0;
		double totalAmountUserEntered = 0;
		
		printMenu();
		System.out.println("Please enter selection:");
		userOption = sc.nextInt();
		System.out.println("Please insert coins:");
		printCoins();
		coinInput = sc.next().charAt(0);
		
		VendingMachine vendingMachine = new VendingMachine();
		
		while (userOption != 4) {
			switch(userOption) {
			case 1:
				drinkCost = vendingMachine.selectDrink(userOption);
				break;
			case 2:
				drinkCost = vendingMachine.selectDrink(userOption);	
				break;
			case 3:
				drinkCost = vendingMachine.selectDrink(userOption);
				break;
			default:
				System.out.println("Error: NOT AN OPTION!");
			}
			
			totalAmountUserEntered += vendingMachine.insertCoins(coinInput);
			while (totalAmountUserEntered < drinkCost) {
				System.out.println("Coins inserted: " + totalAmountUserEntered);
				coinInput = sc.next().charAt(0);
				totalAmountUserEntered += vendingMachine.insertCoins(coinInput);
			}
			System.out.println("Coins inserted: " + totalAmountUserEntered);
			vendingMachine.checkChange(totalAmountUserEntered, drinkCost);
			vendingMachine.printReceipt();
			
			System.out.println("Choose option (1-3):");
			userOption = sc.nextInt();
		}
		System.out.print("Thank you!!");
	}
	
	public static void printMenu() {
		System.out.println("===== Vending Machine ======");
		System.out.println("|1. Buy Beer ($3.00)        |");
		System.out.println("|2. Puy Coke ($1.00)        |");
		System.out.println("|3. Buy Green Tea ($5.00)   |");
		System.out.println("|4. Quit                    |");
		System.out.println("=============================");
	}
	
	public static void printCoins() {
		System.out.println("========== Coins Input ==========");
		System.out.println("Enter 'Q' for ten cents input   |");
		System.out.println("Enter 'T' for twenty cents input|");
		System.out.println("Enter 'F' for fifty cents input |");
		System.out.println("Enter 'N' for a dollar input    |");
		System.out.println("=================================");
	}
}
