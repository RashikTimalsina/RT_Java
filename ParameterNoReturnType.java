import java.lang.*;
class ParameterNoReturnType
{

	public static void main(String[] args)
	{

	printSum(5,5);	
	printAge(2004);

	}
	
	static void printSum(int x,int y)			//there are two parameters inside () 
	{

	int sum=x+y;
	System.out.println("The sum is " +sum);
		
	}

	static void printAge(int birthYear)		//there is a parameter isnide()
	{

	int age=2023-birthYear;
	System.out.println("My age is " +age);

	}
	
}