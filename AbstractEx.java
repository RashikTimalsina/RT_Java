
abstract class Teacher
{
           public abstract void getData();
}

class Employee extends Teacher
{
               public void getData()
                {  
                   System.out.println("I am Employee ");
                }
}


class AbstractEx
{
           public static void main(String[] args)
            {
                 Employee e=new Employee();
                 e.getData();
       
     
   }

}