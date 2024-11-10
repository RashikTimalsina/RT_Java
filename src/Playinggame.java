import java.util.Scanner;
class PlayingGame
{

          //Using LOGICAL OPERATORS used to connect two or more expressions
          // && is used as AND which means both conditions must be true
          // || is used as OR which means either condition must be true
          // ! is used as NOT which means it reverses boolean values of a condition


           Scanner sc;
       public static void main(String[] args)
          {

               Scanner sc=new Scanner(System.in);
                
             System.out.println("You are playing game! "+" Press q or Q to quit ");
             String response=sc.next();

          if(response.equals("q")&&response.equals("Q"))           //Using ! sign before response will give opposite output
             {

             System.out.println("You quit the game ");

              }else {
                     System.out.println("You are still in the game ");

                   }

          }

}
