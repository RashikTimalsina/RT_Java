
class Array2DPractice
{
        public static void main(String[] args)
           {
             
            String[][] bikes=new String[3][3];
                bikes[0][0]="Yamaha";
                bikes[0][1]="Pulsar";
                bikes[0][2]="Honda";
                bikes[1][0]="Bullet";
                bikes[1][1]="KTM";
                bikes[1][2]="M10";
                bikes[2][0]="Apache";
                bikes[2][1]="Duke";
                bikes[2][2]="Crossfire";

               for (int x=0;x<bikes.length;x++)
                {
                    System.out.println();

                   for(int y=0;y<bikes[x].length;y++)
                   {
                      System.out.println(bikes[x][y]);


                    }

                    
 

                }
          }


}