import java.lang.*;
class ExceptionHandlingMethod3
{

	public static void main(String[] args)
	{

	try{

	int myInt=Integer.parseInt("1");		//Parse-Int means it will allocate that value as an argument
	
	}
	catch(Exception e){
	
	System.out.println("Invalid number ");	//printed if try part command is wrong

	}
	finally
	{

	System.out.println("Preety Cool!!!");
	

	}
	
	System.out.println("End here ");		//Printed if try part command is right

	}

}