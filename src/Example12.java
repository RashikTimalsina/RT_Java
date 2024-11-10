import java.util.Scanner;
class Fullname
{    
               String firstname,lastname,f;
	 
               Scanner sc;

               public Fullname()
                {
               Scanner sc=new Scanner(System.in);
              
               System.out.println("Enter first name ");
               firstname=sc.nextLine();

               System.out.println("Enter last name ");
               lastname=sc.nextLine();
                   
               f=firstname+" "+lastname;
             
               System.out.println(f);
                            
}

}
class Example12
{                        
               public static void main(String[] args)
                {
                Fullname f = new Fullname();
                }

}
          
                           

                 