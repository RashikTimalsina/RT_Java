//Single Level Inheritance example 
import java.lang.*;
class Teacher
{
            int id; 
            String name; 
      
}

class Employee extends Teacher
{
             public Employee()
               {
                      id=100;
                      name="Rashik";
                      System.out.println("Id is "+id);
                      System.out.println("Name is "+name);

                }	

}


class SingleLevelInheritance
{
              public static void main(String[] args)
                     {  
                             Employee e= new Employee();
                  }

 }