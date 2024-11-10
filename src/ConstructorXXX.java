
class ConstructorXXX			//This is only the class we created so we can use private inside it
{

	int x;

	private ConstructorXXX()	//Can use Private within the same class however for separate class use Public 
	{

	x=10;

	}


	public static void main(String[] args)
	{

	ConstructorXXX myObj=new ConstructorXXX();
	System.out.println(myObj.x);


	}

}