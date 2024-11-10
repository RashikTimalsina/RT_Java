import java.lang.*;
import java.util.Scanner.*;
class Introduction
{
                 String name,address,getDetails;
                  Scanner sc;
                  public Introduction()
                   {
                         Scanner sc=new Scanner(System.in);     
                           System.out.println("Enter the name");
                              name=sc.nextLine();

                          System.out.println("Enter the address");
                                address=sc.nextLine();

                               getDetails= name+address;
                           System.out.println("My name and address are: "+name +" " +address);
                    }

}

class Intro
{
                  public static void main(String[] args)
                      {
                               
                            Introduction i=new Introduction();

                              
                        }



}











