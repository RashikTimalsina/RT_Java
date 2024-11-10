import java.lang.*;
class MathWork
{
	public static void main(String[] args)
	{

	int num1=500;
	int num2=100;

	System.out.println("Max num is " +Math.max(num1,num2));		//display greatest value
	System.out.println("Min num is " +Math.min(num1,num2));		//display least value

	System.out.println("The round value of 3.9 is " +Math.round(3.9 ));	//round up value=4
	
	System.out.println("Floor value of 4.5 is " +Math.floor(4.5));		//round backwards=4
	System.out.println("Ceil value of 4.5 is " +Math.ceil(4.5));		//round upwards =5
	System.out.println("Ceil value of 4.0 is " +Math.ceil(4.0));		//will not effect in .0

	System.out.println("Square root of 25 is " +Math.sqrt(25));
	System.out.println("Power 4 of 3 is " +Math.pow(3,4));
	System.out.println("Power 2 of 5  is " +Math.pow(5,2));


	}


}