
class ArrayLengthPractice
{
           public static void main(String[] args)
             {
                  String[] bikes=new String[3];          //Here String[3] means 3 index are given which are mentioned below
               
                  bikes[0]="Apache";
                  bikes[1]="Pulsar";
                  bikes[2]="Yamaha";
 
              for (int i=0;i<bikes.length;i++)             //Using length function will display the given values as a output
               {
                 System.out.println(bikes[i]);

               }          

              }

}