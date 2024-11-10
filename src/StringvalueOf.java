import java.lang.*;
class StringvalueOf
{

	public static void main(String[] args)
	{

	/* 
	 String class valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into String.
	*/
	
	int a=10;
	double d=3.2;
	
	
	String s=String.valueOf(a);
	
	System.out.println(s +10);		//concatenates and displays as '1010'

	
	String s2=String.valueOf(d);
	
	System.out.println(s2 +5);

	}



}