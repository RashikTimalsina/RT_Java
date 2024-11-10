import java.lang.*;
class MultiplicationTable
{

	public static void main(String[] args)	
	{


	int num=5;			//this is the number of which table upto 10 is required
	int num2=6;
	
	for(int i=1;i<=10;i++)
	{

	System.out.format(" %d * %d = %d\t ",num, i, num*i);		//this will iterate and dispaly one by one product 
	
	
	System.out.format(" %d * %d = %d\n ",num2, i, num2*i);


	}	
	

	}

}