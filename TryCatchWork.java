import java.lang.*;
import java.util.Scanner;
class TryCatchWork
{

	Scanner sc;
	public static void main(String[] args)
	{

	Scanner sc=new Scanner(System.in);	


	//TRY-CATCH is used for exception handling when you are not sure about any of the output
	 //FINALLY can be used while running both try or catch and it will be displayed everytime for both try catch


	try{

	System.out.println("Enter first number ");
	int n1=sc.nextInt();

	System.out.println("Enter second number ");
	int n2=sc.nextInt();
	
	int sum=n1+n2;

	System.out.println("The sum is " +sum);


	}

	catch(Exception ex)
 	{

	System.out.println("Please enter number only ");

	}

	
	finally
	{

	System.out.println(" This is final ");
	
	}


	}

}