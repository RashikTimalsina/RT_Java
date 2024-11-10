import java.util.Random; //this import is compulsory for printing random numbers to limit

class DiceRoller {

	// global=declared outside a method,but within a class
	// visible only to all parts of a class

	Random random; // Declared outside a class and no need to assign parameter
	int number;

	public DiceRoller() // Constructor should have same name as Class name
	{

		random = new Random();
		roll();

	}

	public void roll() // Notice that no parameters are passed for Global unike Local method
	{

		number = random.nextInt(6) + 1;
		System.out.println(number);

	}

}

class DiceRollerGlobal {

	public static void main(String[] args) {

		DiceRoller dice = new DiceRoller();

	}

}
