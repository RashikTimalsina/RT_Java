import java.util.Scanner;
class NestedForLoopPractice
{
          public static void main(String[] args)
             {
                  int rows;
                  int columns;
                  String symbol="";

                 Scanner sc=new Scanner(System.in);

                 System.out.println("Enter number of rows:");
                  rows=sc.nextInt();

                System.out.println("Enter number of columns:");
                  columns=sc.nextInt();
 
                System.out.println("Enter symbol to use");
                  symbol=sc.next();                 //Note: Here writing nextLine(); instead will escape the output
    
                    

                      for (int i=1;i<=rows;i++)                      //Using FOR loop 
                           {
                               System.out.println();                   

                      for (int j=1;j<=columns;j++)
                           {
                             System.out.print(symbol);          //Here writing 'i/j' instead of symbol will give output in numbers above


                              }    
 

             }

             sc.close();
      }


}