import java.lang.*;
class ExceptionHandling2
{

	public static void main(String[] args)
	{

	try{

	getInt();		

	}
	catch(Exception e){
	
	System.out.println("Invalid number ");	

	}

	System.out.println("End here ");		

	}


private static void getInt()
{

	int myInt=Integer.parseInt("2");
	

}

}