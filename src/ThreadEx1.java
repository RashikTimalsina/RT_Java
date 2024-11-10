import java.lang.*;
class Demo extends Thread
{
            Thread t;
             public Demo()
             {
              Thread t=new Thread(this,"HELLO");
                 t.start();
            }
            
                 public void run()
             {
                
                  for (int i=1;i<=30;i++)    //for looping 
                  {
                       System.out.println(i);
                                  try
                                   {
                                  Thread.sleep(500);    //500=0.5 seconds 
                          
                                     }
                                    catch(Exception e)     //Here exception means errors that can occur when running program
                                     {
                                   
                                  System.out.println(e.getMessage());
                             }

                       }
                                            
          } 

}


class ThreadEx1
{
              public static void main(String[] args)
                  {
                         Demo d=new Demo();
                  }

         

}
 