import java.lang.*;
class Cars
{

	String name;
	public Cars(String name)
	{

	this.name=name;
	

	}


}

class Garage
{

	public void park(Cars car)
	{

		
	}


}

class ObjectsPassedAsArguments
{

	public static void main(String[] args)
	{

	Garage garage=new Garage();

	Cars car1=new Cars("BMW");
	Cars car2=new Cars("Lamborgini");
	
	garage.park(car1);
	garage.park(car2);	

	System.out.println("The "+car1.name+" is parked in the garage");
	System.out.println("The "+car2.name+" is parked in the garage");
	
	


}



}
