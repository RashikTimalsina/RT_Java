import java.lang.*;
class StringBufferappend
{

	public static void main(String[] args)
	{

	/*

	Java StringBuffer class is used to create mutable (modifiable) String objects. 
	The StringBuffer class in Java is the same as String class except it is mutable i.e. (can be changed) and it is synchronized.
	
	Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. 
	So it is safe and will result in an order.	


	StringBuffer()		It creates an empty String buffer with the initial capacity of 16.
	StringBuffer(String str)	It creates a String buffer with the specified string..
	StringBuffer(int capacity)	It creates an empty String buffer with the specified capacity as length.
	

	*/
	
	StringBuffer sb=new StringBuffer("Hello ");	
	
	sb.append("Java");			//original string is modified where java is added with hello 

	System.out.println(sb);		//Hello Java


	}



}