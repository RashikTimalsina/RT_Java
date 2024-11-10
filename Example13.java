import java.lang.*;
import java.util.Scanner;
class Area
{          
                   int l,b,a;
                   Scanner sc;
                    public Area()
                     {
                    Scanner sc=new Scanner(System.in);
                     System.out.println("Enter the value");
                        l=sc.nextInt();
                 
                       System.out.println("Enter the value");
                        b=sc.nextInt();
                          
                         a=l*b;

                         System.out.println(a);

                     }

}                                           


class Example13
{                   
                         public static void main(String[] args)
                         {
                           Area a =new Area();

}

}                       