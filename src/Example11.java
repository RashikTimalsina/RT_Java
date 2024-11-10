import java.lang.*;
import java.util.Scanner;
class Volume
{
             int l,b,h,v;
             
              public Volume()
              {
              Scanner sc=new Scanner(System.in);
               System.out.println("Enter value of length");
               l=sc.nextInt();
   
            System.out.println("Enter value of breadth");
                b=sc.nextInt();

                System.out.println("Enter value of height");
                 h=sc.nextInt();
                 
                  v=l*b*h;
                              System.out.println(v);
               }

}  


class Example11
{
                   public static void main(String[] args)
                    {
                Volume v= new Volume();
                     }

}