import java.lang.*;
class StringConcatenation
{
	public static void main(String[] args)
	{

	
	/*Concatenation means forming a new String by combining multiple Strings.
	
	There are two ways to concatenate Strings in java
	1)  By +(String Concatenation) Operator
	2) By concat() method
		
	*/

	//Method 1(Operator)

	
	String s="Cristiano "+" Ronaldo";

	//System.out.println(s);			//Cristiano Ronaldo
	
	
	String a=50+50+" Ronaldo "+60+40;	      /*After a String literal ie 'Ronaldo', all the + will be treated as string 							concatenation operator where they will link together ie '6040' rather being added;
	
	//System.out.println(a);			//100 Ronaldo 6040





	//Method 2(concat())


	String s1="Cristiano ";
	String s2="Ronaldo";
	
	String s3=s1.concat(s2);		//In s3, s1 is linked with s2 which becomes "Cristiano Ronaldo"
	
	
	System.out.println(s3);

	}



}