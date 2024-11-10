class Break
{

                  public static void main(String[] args)
                  {
                          for (int i=1;i<=10;i++)
                           {
                                 if(i==3)
                            {
                                  break;       //it stops looping thus the output received will be 1 and 2 only
                               }

                               System.out.println(i);

                            }
             
                               System.out.println("HELLO");    //It is printed separately as well now 
            }


}