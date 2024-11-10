import java.lang.*;
class Cars
{

	/*
	
	To-String() = special methods that all objects inherit;
	that returns a string that textually represents an object
	can be used both implicitly and explicitly
	
	*/


	String make="Ford";
	String model="Scorpio";
	String color="red";
	int year=2022;
	

	public String toString()
	{


	String myString=make+"\n"+model+"\n"+color+"\n"+year;
	return myString;

	}


}


class ToString
{

	public static void main(String[] args)
	{

	Cars car=new Cars();
	
	System.out.println(car.toString());


	}



}