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

class Constructor3
{

	public static void main(String[] args)
	{

	Dog myDog=new Dog("Tommy",5);
	

	System.out.println(myDog.name + " " +myDog.age);
	
	}

}