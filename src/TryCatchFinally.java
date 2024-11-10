import java.lang.*;
class TryCatchFinally
{

	public static void main(String[] args)
	{

		System.out.println(printAtNumber());

	}
	
	
	private static int printAtNumber()
	{

	try
	{

	return 3;	

	}
	catch(Exception e)
	{

	return 4;
	
	}
	finally			//this statement will run always unlike try or catch statements
	{

	return 5;

	}
	
	}

}