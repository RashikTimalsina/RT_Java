import java.lang.*;
import java.util.Scanner;
class Snake
{     
                 Scanner sc;
                 public Snake()
              {
                        
                  

                            String mass,force;
                          final double gravity=9.8;
                    
                          Scanner sc= new Scanner(System.in);
         
                        System.out.println("Enter the value of mass");
                        mass=sc.nextLine();
   

                    
                         force=mass+gravity ;
                      
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















	




