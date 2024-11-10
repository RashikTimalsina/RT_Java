import java.lang.*;
class StringComparison4
{

	public static void main(String[] args)
	{

	// By using compareTo() method;

	/* Suppose s1 and s2 are two String objects.

	If:
	s1 == s2 : 	The method returns 0 lexicographically.
	s1 > s2 : 	The method returns a positive value lexicographically.
	s1 < s2 : 	The method returns a negative value lexicographically.
	
	*/
	

	String s1="Rashik";
	String s2="Rashik";			//6 characters
	String s3="Ratan";			//5 characters

	System.out.println(s1.compareTo(s2));			//0(s1==s2)
	System.out.println(s1.compareTo(s3));			//1(s1>s3)
	System.out.println(s3.compareTo(s1));			//-1(s3<s1)


	}


}