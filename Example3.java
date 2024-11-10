import java.lang.*;
class Volume
{
           int l,b,h,v; 
            public void Cube()
             {
                    l= 2;
                     b=3;
                      h=4;
                        v=l*b*h;

System.out.println(v);
}

}


class Example3
{
              public static void main(String[] args)
{
               Volume v=    new Volume();
                 v.Cube();
}

}