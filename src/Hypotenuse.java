import java.util.Scanner;
class Hypotenuse
{
           Scanner sc;
         public static void main(String[] args) 
           {

               double p;
               double b;
               double h;
          
          Scanner sc=new Scanner(System.in);
           
         System.out.println("Enter the size of p");
             p=sc.nextDouble();


           System.out.println("Enter the size of b");
              b=sc.nextDouble();

             
             h=Math.sqrt((p*p)+(b*b));

             System.out.println("The hypotenuse is " +h);
          

        }



}