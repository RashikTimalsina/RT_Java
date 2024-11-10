class Printer<Type extends Animal> {
	Type toPrint;

	// Constructor should accept Type instead of int
	public Printer(Type toPrint) {
		this.toPrint = toPrint;
	}

	public void print() {
		toPrint.eat();
		System.out.println(toPrint); // You may want to override toString() in Cat or Dog for meaningful output
	}
}

class Animal {
	String name;
	int age;

	public void eat() {
		System.out.println("yum yum yum !!!");
	}
}

// Define Cat class, which extends Animal
class Cat extends Animal {
	@Override
	public String toString() {
		return "Cat: " + name;
	}
}

// Define Dog class, which extends Animal
class Dog extends Animal {
	@Override
	public String toString() {
		return "Dog: " + name;
	}
}

class BoundedGenerics {
	public static void main(String[] args) {
		Printer<Cat> myCatPrint = new Printer<>(new Cat());
		myCatPrint.print();

		Printer<Dog> myDogPrint = new Printer<>(new Dog());
		myDogPrint.print();
	}
}
