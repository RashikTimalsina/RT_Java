interface A
{
              public void demoA();

}

interface B
{
           
             public void demoB();     

}

interface C
{

               public void demoC();

}

class D implements A,B,C
{

           public void demoA()
              {
  
                    System.out.println("I am A");

               }


           public void demoB()
               {
                       System.out.println("I am B");
       
              }

            public void demoC()
              {
                     System.out.println("I am C");

            }


}


class InterfacePractice
{

             public static void main(String[] args)

               {

                   D d=new D();
                   d.demoA(); 
                   d.demoB();
                   d.demoC();
                   

               }



}






