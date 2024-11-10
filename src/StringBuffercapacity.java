import java.lang.*;
class StringBuffercapacity
{

	public static void main(String[] args)
	{


	/*

	The capacity() method of the StringBuffer class returns the current capacity of the buffer. 
	The default capacity of the buffer is 16. 
	If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2. 
	For example if your current capacity is 16, it will be (16*2)+2=34.

	*/
	

	StringBuffer sb=new StringBuffer();
	
	System.out.println(sb.capacity());		//default 16(index)


	//	01234
	sb.append("Hello");
	
	System.out.println(sb.capacity());		//now also 16 because it is not exceeding the default capacity


	sb.append("Java is my favorite language");
	
	System.out.println(sb.capacity());		//now 34 (old capacity*2 +2)


	}



}