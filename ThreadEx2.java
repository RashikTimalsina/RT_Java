import java.lang.*;
class Demo implements Runnable
{
            Thread t;
             public Demo()
             {
                 t=new Thread(this,"HELLO");
                 t.start();
            }
            
                 public void run()
             {
                
                  for (int i=1;i<=30;i++)               //for looping
                  { 
                       System.out.println(i);
                         try                                          //try and catch always come together
                          {
                                  Thread.sleep(500);
                          
                           }
                                    catch(Exception e)         //exception means error 
                           {
                                   
                              System.out.println(e.getMessage());
                     }


               }
                             
          } 

}

class ThreadEx2
{
                  public static void main(String[] args)
                  {
                      Demo d=new Demo();
           
                     for (int i=1;i<=30;i++)      //for looping 
                         {
                             
                         System.out.println(i);
                         try
                          {
                                  Thread.sleep(1000);    //1000=1seconds
                          
                           }
                              catch(Exception e)           
                           {
                                   
                              System.out.println(e.getMessage());
                     }


              }


       }

}





 