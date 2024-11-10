import java.lang.*;
class Vehicle
{

	double speed;

	void run()
	{

	System.out.println("The Vehicle is running ");	

	}

	
	void stop()
	{

	System.out.println("The Vehicle is stopped ");

	}

}

class Car extends Vehicle 
{

	int doors=4;
	

}

class Bike extends Vehicle
{

	int pedals=2;


}

class InheritanceBroCode				//Main class
{
	
	public static void main(String[] args)
	{

	Car car=new Car();
	//car.run();				//Calling the run method 
	
	Bike bike=new Bike();
	//bike.stop();				//Calling the stop method


	System.out.println(car.doors);			//Printing doors located at Car class 
	System.out.println(bike.pedals);			//Printing pedals located at Bike class

	}



}
