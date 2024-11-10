import java.lang.*;
class MultiCatchStatement
{

	public static void main(String[] args)
	{

	try{

	getInt();		

	}

	catch(NumberFormatException nfe)		//Catch1
	{		
	
	System.out.println("Invalid number ");	

	}

	catch(NullPointerException npe)
	{					//Catch2
	
	System.out.println("Invalid number ");	

	}

	System.out.println("End here ");			//this will be printed if try statement is true	

	}



	private static void getInt()
	{

	int myInt=Integer.parseInt("2");
	//int myInt=Integer.parseInt("Rashik");

	}

}