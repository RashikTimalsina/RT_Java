import java.lang.*;
import java.util.Scanner;
class NameAgeInput
{
         
               Scanner sc;
           public static void main(String[] args)
             {

                   Scanner sc= new Scanner(System.in);  
                    
                System.out.println("What is your name? ");
                   String name=sc.nextLine();

               System.out.println("How much old are you?");
                   int age=sc.nextInt();

                sc.nextLine();
 
               System.out.println("What is your favorite food?");
                  String dish=sc.nextLine();


                 System.out.println("Hello! I am  " +name);
                 System.out.println("I am " +age+ " "+"years old");
                  System.out.println("My favorite food is " +dish);


           }

 
}