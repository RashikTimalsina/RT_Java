import java.lang.*;
class Vehicle				//Parent Class
{

	void run()				//Defining a method
	{

	System.out.println("Vehicle is running");

	}


}


class MethodOverriding2 extends Vehicle			//Child class extends Parent class
{

	
	void run()					//Defining the same method as in the parent class
	{

	System.out.println("Bike is running");		//Statements should be different

	}


	public static void main(String[] args)
	{

	MethodOverriding2 obj=new MethodOverriding2();			//creating object
	obj.run();							//calling method

	}
	
}