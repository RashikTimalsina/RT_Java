import java.lang.*;
class IntegerPrinter
{

	int thingtoPrint;

	public IntegerPrinter(int thingtoPrint)
	{

	this.thingtoPrint=thingtoPrint;
	
	}

	public void print()
	{

	System.out.println(thingtoPrint);


	}

}


class Generics
{
	
	public static void main(String[] args)
	{

	IntegerPrinter myPrint=new IntegerPrinter(24);
	myPrint.print();


	}


}