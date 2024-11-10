import java.lang.*;
import java.util.Scanner;
class IfelseUserInput
{
	Scanner sc;			//declaring this is optional	
	public static void main(String[] args)
	{

	int age;

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your age !!! ");
	age=sc.nextInt();
	
	
	if(age>=18 && age<=60)		//Using AND operators means both conditions given must be true 
	{					//3 types of Operators=&& ,|| ,!
	
	
	System.out.println("You are eligible to vote !!! ");	
	
	}
	else 
	{

	System.out.println("Sorry! You cannot vote !!! ");

	}

         }


}