import java.lang.*;
class ExceptionHandlingMethod2
{

	public static void main(String[] args)
	{

	try{

	getInt();		

	}
	catch(Exception e){
	
	System.out.println("Invalid number ");	

	}

	System.out.println("End here ");			//this will be printed if try statement is true	

	}


private static void getInt()
{

	int myInt=Integer.parseInt("2");
	

}

}