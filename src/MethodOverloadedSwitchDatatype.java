import java.lang.*;
class MethodOverloadedSwitchDatatype
{

	public static void main(String[] args)
	{

	add(5 , 5);					//this will print (int, int) type part
	add(5.0 , 5);				//this will print (double, int) type part
	add(5, 5.0);				//this will print (int, double) type part
	add(5.0 , 5.0);				//this will print (double, double) type part

	}

	static void add(int x,int y)				// int-int part
	{

	System.out.println("the sum is " +(x+y));

	}	

	
	static void add(int x,double y)				//int-double part
	{

	System.out.println("the sum is " +(x+y));

	}	


	static void add(double x,int y)				//double-int part
	{

	System.out.println("the sum is " +(x+y));

	}
	

	static void add(double x,double y)			//double-double part
	{

	System.out.println("the sum is " +(x+y));

	}		
}
	