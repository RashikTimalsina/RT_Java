import java.lang.*;
class Printer <Type>					//Type Parameter (< Type>)
{

	Type toPrint;				//Declaring
	
	public Printer(Type toPrint)			//CONSTRUCTOR
	{

	this.toPrint=toPrint;				//Applying this function inside a constructor as usual
	
	}

	public void print()				//New Method to be printed
	{
	
	System.out.println(toPrint);
	
	}

}

class PrinterTypeDecider
{

	public static void main(String[] args)
	{


           //Repalcing <Type> by adding <Datatype> in which the value will be printed written alongside the Class Name


	Printer <Integer> myPrint=new Printer<Integer>(25); 		//classname<DT>obj=new classname<DT>() 
	myPrint.print();					//obj.methodtobeprinted();


	Printer <Double> myPrint2=new Printer<Double>(12.132);	
	myPrint2.print();


	Printer <String> myPrint3=new Printer<String>("Hello");
	myPrint3.print();
	
	}




}