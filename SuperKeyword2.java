import java.lang.*;
class Animal
{

	void eat()
	{
		
	System.out.println("Eating....");	
	
	}


}

class Dog extends Animal
{

	
	void bark()
	{


	System.out.println("Bark");

	}

	void eat()
	{


	System.out.println("Eating bread");

	}

	void work()
	{
	
	super.eat();			//super keyword will call the Parent body
	//bark();				//this will call the bark method under child class
	
	}
} 

class SuperKeyword2
{

	public static void main(String[] args)
	{

	Animal animal=new Animal();
	Dog dog=new Dog();
	
	dog.work();
	


	}




}