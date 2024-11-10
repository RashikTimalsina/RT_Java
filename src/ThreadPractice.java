import java.lang.*;
class Dani extends Thread
{

     Thread t;
      public Dani()
      {

        t=new Thread(this,"MyThread");
         t.start();

         }

        public void run()

        {

      for (int i=1;i<=10;i++)
         {
             System.out.println(i);
               try
            {
                Thread.sleep(5000);     //5000 means the output will take 5 seconds gap to run simultaneously
              
            }
           
                catch(Exception e)
              {

                 System.out.println(e.getMessage());       
          
              }
               
           }

       }
  
}


class ThreadPractice
{
        public static void main(String[] args)

        {
             Dani d= new Dani();
     

        }



}













