import java.lang.*;
class Recursion
{

	public static void main(String[] args)
	{

	int total=sum(3);	
	System.out.println("Total is " +total);
	
	}

	static int sum(int num)		//3 replaces (int num) & goes for condition processing
	{
	if (num>0)				//Condition becomes 3>0 which is true 
	{

	return num+sum(num-1);		//this program runs where :    3+sum(3-1) = 3+sum(2)
					//Now, sum(2) will replace (int num)	
	}				//Condition becomes 2>0 which is also true 
	else				// So, program runs where:     2+sum(2-1) =2+sum(1)
	{				//As usual sum(1) will replace (int num)
					//Condition becomes 1>0 which is again true 
	return 0;				//Then,program runs where:     1+sum(1-1) =1+sum(0)
					//Again sum(0) will replace (int num)
	}				//Condition becomes 0>0 which is false 
					//Thus, this will process in else part and 
         }					//Overall,OUTPUT = 3+2+1+0 =6

}