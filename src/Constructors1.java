class Dog
{

	String name;
	int age;

	
	public Dog(String name)
	{

	this.name=name;			//this function is used as constructor function

	}
		

}

class Constructors
{

	public static void main(String[] args)
	{

	Dog myDog=new Dog("Tommy");		//myDog=object;
	
	System.out.println(myDog.name);
	
	}

}