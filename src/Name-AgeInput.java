
import java.util.Scanner;
class NameAgeInput
{
        
               
           public static void main(String[] args)
             {

                   Scanner sc= new Scanner(System.in);  
                    
                System.out.println("What is your name ");
                   String name=sc.nextLine();

               System.out.println("How much old are you");
                   int age= sc.nextInt();

                 System.out.println("Hello" +name);
                 System.out.println("I am " +age+ " "+"years old");



           }

 
}