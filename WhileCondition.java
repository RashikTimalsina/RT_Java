import java.lang.*;
import java.util.Scanner;
class WhileCondition
{
               Scanner sc;
            public static void main(String[] args)
             {
             
              Scanner sc=new Scanner(System.in);
               String name="";
    
             while(name.isBlank())      
            //WHILE condition is used to execute a block code as long as it's condition remains true

               {
                  System.out.println("Enter your name");
                   name=sc.nextLine();


                }
          
                   System.out.println("Hello" +" "+name);

 

            }



}
