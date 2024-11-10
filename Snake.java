import java.lang.*;
import java.util.Scanner;
class Snake
{
                 public void Cat()
                  {
                      String mass,gravity,force;
                          Scanner sc;
                           sc= new Scanner(System.in);
         
                        System.out.println("Enter the value of mass");
                        mass=sc.nextLine();
   
                        System.out.println("Enter the value of gravity");
                         gravity=sc.nextLine();
                    
                         force=mass*gravity;
                      
                  System.out.println(force); 
             }
} 
class  Frog
{
              public static void main(String[] args)
                    {
                        
                           Snake s=new Snake();
                             
                     }

}


}
















