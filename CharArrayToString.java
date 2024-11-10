
class CharArrayToString
{

	public static void main(String[] args)
	{
	
	String s1="java";
	
	char[] c={'S', 'T', 'R', 'I', 'N', 'G'};
	
	String s2=new String(c);			//converts charArray to String as c from chararray is passed as argument

	String s3=new String("Example");		//A template of an argument passed not associated above (RANDOM)

	System.out.println(s1);			//(BASIC) print java;
	
	System.out.println(s2);			//print STRING;

	System.out.println(s3);			//(BASIC) print Example;


	}



}