
class Box 
{

double width;

double height;

double depth;

}
// This class declares an object of type Box.



class BoxDemo
 {

double vol;

public static  void main(String[] args) 
{


Box mybox = new Box();
 

    
// assign values to mybox's instance variables

mybox.width = 10;

mybox.height = 20;

mybox.depth = 15;

// compute volume of box

double vol= mybox.width * mybox.height * mybox.depth;

System.out.println("Volume is " + vol);
}
	
}