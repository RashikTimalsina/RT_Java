import java.lang.*;
class Dog
{

	String NAME;
	int AGE;
	
	public void setName(String NAME)
	{

	this.NAME=NAME;		         //this.function will specify declared name above with a parameter name

	}

	public void bark()
	{

	System.out.println("Bark !!!");

	}

	public String getName()
	{

	return this.NAME;	

	}

}

class ThisFunction
{

	public static void main(String[] args)
	{

	Dog myDog=new Dog();
 	myDog.setName("Molly");

	System.out.println(myDog.getName());	

	}


}