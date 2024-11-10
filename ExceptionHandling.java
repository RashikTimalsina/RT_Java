import java.lang.*;
class ExceptionHandling
{

	public static void main(String[] args)
	{

	try{

		int myInt=Integer.parseInt("1");		//Parse-Int means it will allocate the value 1 to integer
	
	}
	catch(Exception e){
	
	System.out.println("Invalid number ");	//printed if try part command is wrong

	}

	System.out.println("End here ");		//Printed if try part command is right

	}

}