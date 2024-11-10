import java.lang.*;
class Vehicle					//Parent Class
{


	//Method Overriding = Declaring a method in a sub class
	//		which is already present in parent class
	// 		done so that a child class can give its own implementation 


	//Note that  MethodOverriding cannot be run for static methods because of runtime polymorphism
	// Also we cannot override main method 


	void run()					
	{

	System.out.println("Vehicle is running");

	}

	

}


class MethodOverriding extends Vehicle			//Child class extends Parent class
{

	public static void main(String[] args)
	{

	MethodOverriding obj=new MethodOverriding();		
	obj.run();						//Callin the method with child class interface
	

	}



}