import java.lang.*;
class Animal
{

	Animal()
	{

	System.out.println("Animal is created");

	}

}

class Dog extends Animal
{

	Dog()
	{

	System.out.println("Dog is created");

	}	


}

class SuperKeyword4
{

	//EXAMPLE of super keyword where super() is provided by the compiler implicitly(automatically) ,u dont need to write.
	//For more information check out SUPERKEYWORD3 file


	public static void main(String[] args)
	{
	
	Dog d=new Dog();
	
	}


}
