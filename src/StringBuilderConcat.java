import java.lang.*;
class StringBuilderAppend
{

	public static void main(String[] args)
	{

	/* 
	StringBuilder is class provides append() method to perform concatenation operation. 
	The append() method accepts arguments of different types like Objects, StringBuilder, int, char, CharSequence, boolean,double.
	 StringBuilder is the most popular and fastest way to concatenate strings in Java. 						It is mutable class which means values stored in StringBuilder objects can be updated or changed.
	*/
		
	StringBuilder s1=new StringBuilder("Hello");		
	StringBuilder s2=new StringBuilder("World");
	
	StringBuilder s=s1.append(s2);				//append function links or concatenates s1 with s2 

	System.out.println(s);
	
	}







}