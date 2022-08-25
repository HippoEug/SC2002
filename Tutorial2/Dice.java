public class Dice {
	private int valueOfDice;
	
	// constructor
	public Dice() {
		valueOfDice = 0;
	}
	
	// mutator method - set dice value
	public void setDiceValueOne(int val) {
		valueOfDice = val;
	}
	
	// accessor method - get dice value
	public int getDiceValue() {
		return valueOfDice;
	}
	
	// print dice value
	public void printDiceValue() {
		System.out.println("Current Value is " + this.getDiceValue());
	}
}
