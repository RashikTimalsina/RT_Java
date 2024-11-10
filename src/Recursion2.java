import java.lang.*;
class Recursion2
{

	public static void main(String[] args)
	{

	int total=sum(10);	
	System.out.println("Total is " +total);
	
	}

	static int sum(int num)		
	{
	if (num>0)				
	{

	return num+sum(num-1);		
						
	}				
	else				
	{				
					 
	return 0;				
					
	}				
					
         }					

}