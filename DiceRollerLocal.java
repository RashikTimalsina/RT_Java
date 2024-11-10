import java.util.Random; // Importing the Random class

class DiceRoller {
	private Random random; // Instance variable to hold the Random object
	private int number; // Instance variable to hold the rolled number

	public DiceRoller() { // Constructor should have the same name as the class
		random = new Random(); // Initialize the Random object
		roll(); // Call the roll method to roll the dice
	}

	public void roll() { // No parameters needed here
		number = random.nextInt(6) + 1; // Generate a random number between 1 and 6
		System.out.println(number); // Print the rolled number
	}
}

class DiceRollerLocal {
	public static void main(String[] args) {
		DiceRoller dice = new DiceRoller(); // Create a new DiceRoller object, which rolls the dice
	}
}
