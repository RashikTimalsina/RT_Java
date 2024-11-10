
class Car
{

	String make,model,color;
	int year;
	double price;
	
	public  void Drive()
	{

	 make="Chevrolet";
	 model="Corvette";	
	year=2023;
	color="blue";
	price= 500000.00;

	
	System.out.println("You drive the car ");

	}

	public void Brake() 
	{

	System.out.println("You step on the brake ");

	}


}



class OOP1
{

	public static void main(String[] args)
	{

	Car c=new Car();
	c.Brake();	
	c.Drive();

	System.out.println(c.make);
	System.out.println(c.model);
	

	}
	

}