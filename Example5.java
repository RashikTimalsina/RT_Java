import java.lang.*;
class Interest
{
            int p,t,r,i;
            public void demo()
{
             p = 1500;
             t = 2;
             r = 5;
             i = (p*t*r)/100;
            System.out.println(i);
}

}


class Example5
{
                public static void main(String[] args)
{
                 Interest i1 =new Interest();
                  i1.demo();
}

}
