
class ConstructorParameter
{

	int x;

	private ConstructorParameter(int y)	           //Private is used within the same class otherwise use 'Public'
	{

	x=y;

	}

	
	public static void main(String[] args)	//Here we cannot use Private instead of public as it is main method
	{

	ConstructorParameter myObj=new ConstructorParameter(10);
	System.out.println(myObj.x);


	}

}