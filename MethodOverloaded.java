import java.lang.*;
class MethodOverloaded
{

	//Overloaded Method= methods that start the name but have different parameters 
	//		   Method name + parameters = method signature


	//Acheive Method Overloading by : Changing the number of parameters.
	//			     Changing the data type of parameters.
	


	public static void main(String[] args)
	{
   
	int x=add(2,3);				//here are two parameters inside ();
	System.out.println(x);

	int y=add(2,3,4);				//here are three parameters inside ();
	System.out.println(y);

	int z=add(2,3,4,5);				//here are four parameters inside ();
	System.out.println(z);
	
	

	}

               	
	static int add(int a,int b)				//Method add with two parameters
	{

	System.out.println("This is overloaded method 1");
 	return a+b;
	
	}	
	        	

	//Method Overloading concept is used here
	static int add(int a,int b,int c)			//Method add with three parameters
	{

	System.out.println("This is overloaded method 2");
 	return a+b+c;
	
	}
	
	// Method Overloading concept is used here
	static int add(int a,int b,int c,int d)
	{

	System.out.println("This is overloaded method 3");		
 	return a+b+c+d;

	}
 
}


	