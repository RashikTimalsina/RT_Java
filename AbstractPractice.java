import java.lang.*;
abstract class Justin
{
        public abstract void getDetails();

}

class Selena extends Justin
{

             public void getDetails()
              {
                  System.out.println("I hate Justin ");

              }

}

class AbstractPractice
{

       public static void main(String[] args)
         {

             Selena x=new Selena();
              x.getDetails();


         }

}