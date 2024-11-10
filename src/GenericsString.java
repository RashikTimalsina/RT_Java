
class StringPrinter
{

	String thingtoPrint;					//Declared datatype and variable

	public StringPrinter(String thingtoPrint)			//CONSTRUCTOR
	{

	this.thingtoPrint=thingtoPrint;			           //when there is constructor, 'this' function is used
	
	}

	public void print()
	{

	System.out.println(thingtoPrint);


	}

}


class GenericsString
{
	
	public static void main(String[] args)
	{

	StringPrinter myPrint=new StringPrinter("Hello");		//Constructor object=new Constructor(...);
	myPrint.print();					//object.new method to print();


	}


}