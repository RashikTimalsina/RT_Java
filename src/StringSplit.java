import java.lang.*;
import java.util.*;
class StringSplit
{

	public static void main(String[] args)
	{
	
	String text=new String("Hello, my name is Rashik ");
	
	String[] sentences=text.split("\\.");		/* Splits the sentence by the delimeter passed as an argument */

	System.out.println(Arrays.toString(sentences));



	}



}