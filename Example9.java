import java.lang.*;
import java.util.Scanner;
class Area
{   
       int l,b,a; 
       public Area()

          {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter value of length");
        l=sc.nextInt();

        System.out.println("Enter value of breadth");
        b=sc.nextInt();
        
         a=l*b;
                           
         System.out.println(a);
} 
                        

}


class Example9
{   
                 public static void main(String[] args)

{
               Area a = new Area();
 }

}
   
        