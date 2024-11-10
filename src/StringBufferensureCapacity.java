import java.lang.*;
class StringBufferensureCapacity
{

	public static void main(String[] args)
	{


	/*

	 ensureCapacity() method of the StringBuffer class ensures that the given capacity is the minimum to the current capacity. 
	If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2.
	 For example if your current capacity is 16, it will be (16*2)+2=34.
	
	
	*/

	
	StringBuffer sb=new StringBuffer();
	
	System.out.println(sb.capacity());		//default 16(index)


	//	01234
	sb.append("Hello");
	
	System.out.println(sb.capacity());		//now also 16 because it is not exceeding the default capacity


	// 	 012345678901234567890123
	sb.append("Java is my favorite language");
	
	System.out.println(sb.capacity());		//now 34 (old capacity*2 +2)



	sb.ensureCapacity(10);			
	
	System.out.println(sb.capacity());		//(16*2 +2) =34 

	
	sb.ensureCapacity(50);			//should be more than 34
	
	System.out.println(sb.capacity());		//(34*2 +2)=70

	
	
	sb.ensureCapacity(100);			//should be more than 70
	
	System.out.println(sb.capacity());		//(70*2+2)=142 


	sb.ensureCapacity(143);			//should be more than 142 
	
	System.out.println(sb.capacity());		//(142*2 +2)=286	and goes on increasing orderly



	}











}