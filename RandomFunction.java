import java.util.Random;
class RandomFunction
{
          public static void main(String[] args)
             {
                Random number=new Random();    //Using Random gives random values as output
               

       int x=number.nextInt();
       int y=number.nextInt(5);            //this will display different values upto 4 starting from 
       int z=number.nextInt(5)+1;         //this will display different values upto 5 starting from 1 as there is +1 in statement

               System.out.println(x);
               System.out.println(y);
                System.out.println(z);
             }



}