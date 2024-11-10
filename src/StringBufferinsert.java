import java.lang.*;
class StringBufferinsert
{

	public static void main(String[] args)
	{

				     01234
	StringBuffer sb=new StringBuffer("Hello");
	
	sb.insert(1,"Java");		//inserts Java at index number 1  by not replacing the element of that index
	
	System.out.println(sb);	//HJavaello



	}



}