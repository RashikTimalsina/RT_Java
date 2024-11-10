import java.lang.*;
class Multiplication
{

	static void Java(int n)
	{

	for(int i=1;i<=10;i++)
	{


	//E.g 		 5 X   2  = 10        5,2,5*2
	System.out.format("%d X %d = %d\n", n ,i, n*i );		//System.out.Format is used with format specifiers of c 

	}



	}



}

class Format
{

	public static void main(String []args)
	{

	Multiplication mul=new Multiplication();
	mul.Java(5);

	}



}