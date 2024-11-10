import java.lang.*;
import java.util.ArrayList;
class RemoveFunction
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

       food.remove(1);    		//REMOVE function deletes the index character
                                                                     //Note that Index number starts with 0 which is momo here.
      for (int i=0;i<food.size();i++)
              {

            System.out.println(food.get(i));

             }

        }


}