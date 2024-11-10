
interface Animal // Interface
{

	public void animalSound(); // interface method (does not have a body)

	public void sleep(); // interface method (does not have a body)

}

class Pig implements Animal // Pig "implements" the Animal interface
{

	public void animalSound() {

		System.out.println("The pig says: wee wee"); // The body of animalSound() is provided here

	}

	public void sleep() {

		System.out.println("Zzz"); // The body of sleep() is provided here

	}

}

class AnimalInterface {

	public static void main(String[] args) {

		Pig myPig = new Pig(); // Create myPig as object
		myPig.animalSound(); // Calling animalSound method
		myPig.sleep(); // Calling sleep method

	}

}

	