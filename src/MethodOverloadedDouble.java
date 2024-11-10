import java.lang.*;
class MethodOverloadedDouble
{
	public static void main(String[] args)
	{
	
	double x=add(2.0,3.0);
	System.out.println(x);

	double y=add(2.0,3.0,4.0);
	System.out.println(y);

	double z=add(2.0,3.0,4.0,5.0);
	System.out.println(z);


	}

	static double add(double a,double b)
 	{

	System.out.println("This is overloaded method X");
	return a+b;

	}

	static double add(double a,double b,double c)
	{

	System.out.println("This is overloaded method Y");
	return a+b+c;

	}

	static double add(double a,double b,double c,double d)
	{

	System.out.println("This is overloaded method Z");
	return a+b+c+d;

	}

}