
class Dog
{

	String name;
	int age;

	
	public Dog(String name ,int age)
	{

	this.name=name;
	this.age=age;
		
	}
		

}

class Constructors3
{

	public static void main(String[] args)
	{

	Dog myDog1=new Dog("Tommy" ,7);
	Dog myDog2=new Dog("Sheru",8);

	System.out.println(myDog1.name + " " +myDog1.age);
	System.out.println(myDog2.name + " " +myDog2.age);

	}

}