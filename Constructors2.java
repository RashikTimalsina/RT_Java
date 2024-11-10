class Dog
{

	String name;
	int age;

	public Dog(int age)
	{

	this.age=age;

	}
	
		
	

}

class Constructors2
{

	public static void main(String[] args)
	{

	Dog myDog=new Dog(7);
	
	System.out.println(myDog.age);

	}

}