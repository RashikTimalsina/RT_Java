import java.lang.*;

	//super = keyword refers to the superclass (Parent) of an object
	//	very similar to 'this' keyword and also replace 'this' keyword by invoking the parent class/constructor


class Animal					//Parent Class
{

	String color="white";				//Parent body

}

class Cat extends Animal				//Child Class
{
	
	String color="black";				//Child body

	void printColor()				
	{
	
	System.out.println(color);			//This will print the child body  i.e 'black'

	System.out.println(super.color);			//This will print the parent body because of super keyword i.e 'white'
	}	

}

class SuperKeyword
{


	public static void main(String [] args)
	{

	
	Animal animal=new Animal();
	Cat cat=new Cat();


	cat.printColor();
		
	
	}




}