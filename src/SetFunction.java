import java.lang.*;
import java.util.ArrayList;
class SetFunction
{

     public static void main(String[] args)
     
      {    

         //ArrayList= a resizable size
         //                  Elements can be added and removed after compilation phase
         //                   store reference data types


      ArrayList<String> food=new ArrayList<String>();

      food.add("momo");
      food.add("chowmein");
      food.add("burger");
  
      food.set(1,"pizza");  		//SET function is formed as  .set(index, new char replacing index char)
   
      for (int i=0;i<food.size();i++)
              {

            System.out.println(food.get(i));

             }

        }


}