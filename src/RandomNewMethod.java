import java.lang.*;
class RandomNewMethod
{

	public static void main(String[] args)
	{

	generateRandomNumber(0,10);	

	}
	

	static void generateRandomNumber(int min,int max)
	{

               int num=(int)(Math.random()*(10-1+1)+1);  	          //prints random int values from 0 to 10 creating new method
                   System.out.println(num); 

	}

}