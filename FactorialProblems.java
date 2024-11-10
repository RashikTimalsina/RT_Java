import java.lang.*;
class FactorialProblems
{
	public static void main(String[] args)
	{

	int i;
 	int fact=1;				//this remains constant and it is a product value to be multiplied with i
	int number=5;			// factorial of 5 willl be displayed

	for(i=1;i<=number;i++)
	{

	fact=fact*i;
	
	//EXAMPLE
	
	//1=1*1;
	//2=1*2;
	//3=1*3;
	//4=1*4;
	//5=1*5;
	

	}
	
	System.out.println("Factorial of " + number + " is " +fact);		//fact=1*2*3*4*5=120;


	}




}