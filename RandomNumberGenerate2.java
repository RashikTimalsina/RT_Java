import java.lang.*;
class RandomNumberGenerate2
{


	public static void main(String[] args)
	{

	int min=100;
	
	int max=500;


	//Generate random value of double type from 100 to 500
	
	System.out.println("Print random number of double type " +min +" to " +max+ ":");		//1st statement
	double a=Math.random()*(max-min+1)+min;
	System.out.println(a);							//2nd statement

	
	//Generate random value of int type from 100 to 500
	
	System.out.println("Print random number of int type " +min +" to " +max+ ":");		// 1st statement
	int b=(int)(Math.random()*(max-min+1)+min);
	System.out.println(b);							//2nd statement











	}















}