import java.lang.*;

// An improved version of the season program.
class Switch 
{
           public static void main(String[] args)
           {	
             int month = 12;		//Break in this case number 
             String season;          
           switch (month) 
           {
             case 12:			//Dec
             case 1:			//Jan
             case 2: 			//Feb
             season = "Winter";

                 break;

              case 3:			//March
              case 4:			//April
              case 5:			//May
            season = "Spring";

                 break;

              case 6:			//June
              case 7:			//July
               case 8: 			// Aug
             season = "Summer";

                 break;

               case 9:  			//Sep
              case 10:			//Oct
              case 11:			//Nov
            season = "Autumn";

               break;

            default:            season = "Bogus Month";
          }
    System.out.println("December is in the " + season + ".");

       }


}