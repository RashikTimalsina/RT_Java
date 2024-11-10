
import java.util.ArrayList;
import java.util.Iterator;
class IteratorPractice
{
	
	public static void main(String[] args)
	{

	ArrayList<String> colors=new ArrayList<String>();

	colors.add("BLUE");
	colors.add("BLACK");
	colors.add("GREEN");
	colors.add("RED");
	
	Iterator<String> i=colors.iterator();
	
	//System.out.println(i.next());		//Display the element at O index
		
				
	while(i.hasNext())			//hasNext
	{

	System.out.println(i.next());		//Display all the elements inside the collection

	}


	}


}