import java.lang.*;
class Animal
{

	void speak()
	{

	System.out.println("The animal speaks");

	}


}

class Cat extends Animal
{
	
	@Override				//this is written in the child class where we want to override the method

	void speak()
	{

	System.out.println("The cat says 'Meow' ");
	
	}

}

class MethOverridingBroCode
{
	
	public static void main(String[] args)
	{

	Animal animal=new Animal();
	Cat cat=new Cat();

	//animal.speak();
	cat.speak();
	
	}


}