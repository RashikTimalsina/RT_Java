import java.lang.*;
class StringFormatter 
{  

	public static String reverseString(String str)
	{  
    
	StringBuilder sb=new StringBuilder(str);  
    	sb.reverse();  
    	return sb.toString();  
		


	}  


}  
class TestStringFormatter 
{  

	public static void main(String[] args)
	 {  
    
	System.out.println(StringFormatter.reverseString("RASHIK"));  
    	System.out.println(StringFormatter.reverseString("TIMALSINA"));      
    }  
} 