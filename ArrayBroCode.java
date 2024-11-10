import java.lang.*;
class Food
{

	String name;
	public Food(String name)	
	{

	this.name=name;


	}



}

class ArrayBroCode
{

	public static void main(String[] args)
	{

	//Food[] refrigerator=new Food[3];

	Food food1=new Food("Momo");
	Food food2=new Food("Chowmein");
	Food food3=new Food("Pizza");


	Food[] refrigerator={food1,food2,food3};			//Another direct method to do array problem

	//refrigerator[0]=food1;
	//refrigerator[1]=food2;
	//refrigerator[2]=food3;

	System.out.println(refrigerator[0].name);
	System.out.println(refrigerator[1].name);
	System.out.println(refrigerator[2].name);


	}

} 