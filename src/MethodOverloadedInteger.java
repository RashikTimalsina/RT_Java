import java.lang.*;
class MethodOverloadedInteger
{

	//Overloaded Method= methods that start the name but have different parameters 
	//		   Method name + parameters = method signature

	public static void main(String[] args)
	{
   
	int x=add(2,3);
	System.out.println(x);

	int y=add(2,3,4);
	System.out.println(y);

	int z=add(2,3,4,5);
	System.out.println(z);
	
	
	}

               	
	static int add(int a,int b)           		//void is not used means return type
	{

	System.out.println("This is overloaded method 1");
 	return a+b;
	
	}	
	        	
	static int add(int a,int b,int c)
	{

	System.out.println("This is overloaded method 2");
 	return a+b+c;
	
	}
	
	
	static int add(int a,int b,int c,int d)
	{

	System.out.println("This is overloaded method 3");		
 	return a+b+c+d;

	}
 
}


	