import java.lang.*;
import java.util.*;			//Opens all packages inside subpackage 'util';
class WrapperClassic
{

	public static void main(String[] args)
	{

	byte b=1;
	//int i=5;
	//float f=0.5f;
	//double d=2.423;
	//char c='W';


	//Convert into wrapper objects[Boxing]
	
	Byte obj1=Byte valueOf(b);
	//if(obj1 isinstanceof Byte)
	{

	System.out.println("An object of Byte is created");
		
	}

	Integer obj2=new valueOf(i);
	//if(obj2 isinstanceof Byte)
	{

	System.out.println("An object of Integer is created);

	}
	
	}



}