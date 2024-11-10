import java.lang.*;
class StringBuilderJoin
{

	public static void main(String[] args)
	{

	// String.join() method accepts arguments first a separator and an array of String objects.

	String s1=new String("Hello");
	String s2=new String("World");
	
	String s=String.join(" ",s1,s2);		// " " must be used before variables to link both Strings together

	
	System.out.println(s);			//Hello World
	

	}



}