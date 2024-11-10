
//Interface is a keyword in java which is used to achieve multiple inheritance in java.

interface Father           //interface is a keyword
{
           public void demoFather();
}

interface Mother
{
            public void demoMother();

}


class Child implements Father,Mother         //class Child is implementing two interfaces Father and Mother
{
           public void demoFather()
            {
                System.out.println("I am father ");
             }

            public void demoMother()
               {
                    System.out.println("I am mother ");
               }

    }


class InterfaceEx
{
        public static void main(String[] args)
           {
             Child c=new Child();      //c is a keyword
              c.demoFather();
              c.demoMother();
           }


}









