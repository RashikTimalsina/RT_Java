import java.lang.*;
class ForEach2
{

	//For each loop is read only

	public static void main(String[] args)
	{
			
	int sum=0;			//declare;

	int[] nums={1,2,3,4,5,6,7,8,9,10};
	
	
	for(int x : nums)		//For-each loop where elements of nums relates x
	{


	System.out.println("Value is :"+x);
	sum+=x;				//Increasing by 1

	if(x==5)

	break;			//stop the loop when 5 is obtained

	}


	System.out.println("Sum of first five elements : " +sum);

	

	}

}