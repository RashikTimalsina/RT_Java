import java.lang.*;
class StringBufferdelete
{

	public static void main(String[] args)
	{
	
				     01234
	StringBuffer sb=new StringBuffer("Hello");
	
	sb.delete(1,3);		//deletes the element at index 1 to 2 as endindex is mutable  
	
	System.out.println(sb);	//Hlo



	}



}