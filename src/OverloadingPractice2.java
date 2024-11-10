import java.lang.*;
class Adds
{

	static int add(int a,int b)
	{

	return a+b;

	}


	static double add(double a,double b)
	{

	return a+b;

	}
	

}

class OverloadingPractice2
{

	public static void main(String[] args)
	{

	System.out.println(Adds.add(12,13));
	System.out.println(Adds.add(3.123,5.123));

	}



}