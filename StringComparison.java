import java.lang.*;
class StringComparison
{

	public static void main(String[] args)
	{

	// By using equals() method;

	String s1="Rashik";
	String s2="Rashik";
	String s3=new String("Rashik");
	String s4="Ram";
		
	System.out.println(s1.equals(s2));		//true
	System.out.println(s3.equals(s3));		//true
	System.out.println(s1.equals(s4));		//false
	


	}


}