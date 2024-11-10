//Multi Level Inheritance Example
import java.lang.*;
class Teacher
{
            int id;
            String name;
            int mid;    // manager id
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

class Manager extends Employee
{
            public Manager()
              {
                  mid=123;
                 System.out.println("Manager id is "+mid);
          
     }

}


class MultiLevelInheritance
{
               public static void main(String[] args)
                {
                      Manager m=new Manager();
                 
      }


}




		











