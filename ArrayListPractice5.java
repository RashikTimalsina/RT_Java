import java.util.ArrayList;
import java.util.Collections;
class ArrayListPractice5
{


	public static void main(String[] args)
	{

	ArrayList<String>color=new ArrayList<String>();

	color.add("Black");
	color.add("Red");
	color.add("Blue");
	color.add("White");

	Collections.sort(color);		

	for(String i : color)
	{

	System.out.println(i);
	

	}


	
	}


}