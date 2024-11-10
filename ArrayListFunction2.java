import java.util.ArrayList;
class ArrayListFunction2
{

    public static void main(String[] args)
     {

         ArrayList<Double> level=new ArrayList<Double>();

        level.add(21.5);
        level.add(22.5);
        level.add(23.5);
 
       for (int x=0;x<level.size();x++)
            {
                 System.out.println(level.get(x));
           
            }            


     }

}