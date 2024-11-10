import java.lang.*;
class Book
{
             String name,address;
              public void demo()
               {
                   name="Rashik Timalsina";
                   address="Imadol";
                   
                  System.out.println("My Name is " +name);
                  System.out.println(" My Address is " +address);
            }


}

class Copy
{
                public static void main(String[] args)
                  {
                     Book b=new Book();
                      b.demo();                      
 
                 }

}