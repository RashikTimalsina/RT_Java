import java.lang.*;
class Adds
{


	static int add (int a,int b)
	{

	return a+b;

	}


	static int add (int a,int b,int c)
	{
	
	return a+b+c;

	}


}

class OverloadingPractice
{

	public static void main(String[] args)
	{

	System.out.println(Adds.add(10,12));	
	
	System.out.println(Adds.add(10,12,14));

	}


}