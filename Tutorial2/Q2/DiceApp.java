import java.util.Scanner;
import java.lang.Math;

public class DiceApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomNumber;
		int totalDiceValue;
		
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		System.out.println("Press <key> to roll the first dice");
		sc.hasNext();
		randomNumber = (int)(Math.random() * (5) + 1);
		dice1.setDiceValueOne(randomNumber);
		dice1.printDiceValue();
		
		System.out.println("Press <key> to roll second dice");
		sc.nextLine();
		sc.hasNext();
		randomNumber = (int)(Math.random() * (6) + 1);
		dice2.setDiceValueOne(randomNumber);
		dice2.printDiceValue();
		
		totalDiceValue = dice1.getDiceValue() + dice2.getDiceValue();
		System.out.println("Your total number is: " + totalDiceValue);
	}
}
