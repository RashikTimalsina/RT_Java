import java.lang.*;
class DoublePrinter
{

	double toPrint;
	
	public DoublePrinter(double toPrint)
	{

	this.toPrint=toPrint;

	}

	public void print()
	{
	
	System.out.println(toPrint);
	
	}

}

class GenericsDouble
{

	public static void main(String[] args)
	{

	DoublePrinter myPrint=new DoublePrinter(3.145);
	myPrint.print();

	}




}