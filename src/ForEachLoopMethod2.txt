import java.lang.*;
import java.util.ArrayList;
class ForEachLoopMethod2
{
	public static void main(String[] args)
                   {

                    // for-each = traversing technique to iterate through the elements in an array/collection
                    //                   less steps,more readable
                    //                    less flexible
      
   
              ArrayList<String> animals=new ArrayList<String>();
                   
                animals.add("cat");
                animals.add("dog");   
                animals.add("rat");
  
                for(String s:animals)
                    {
 
         	     System.out.println(s);

	}


      }


}
