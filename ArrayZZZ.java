
class ArrayZZZ
{
	public static void main(String[] args)
	{

	//  index :                0    ,     1     ,       2     ,         3

	String [] names={"Rashik","Sunil","Prabeen","Saugat"};
	int [] grades={70,80,60,50};

	//We have two ways to run this array program

	// 1) By using for loop

	for (int i=0;i<names.length;i++)			  //names.length=4
	{
		
	System.out.println(names[i] + " grade is " +grades[i]);		// where i=0,1,2,3
		
	}


	//  2) By writing println statement separately 

	System.out.println();				//To cross a line						

	System.out.println(names[0] + " grade is " +grades[0]);
	System.out.println(names[1] + " grade is " +grades[1]);
	System.out.println(names[2] + " grade is " +grades[2]);
	System.out.println(names[3] + " grade is " +grades[3]);


	}
 	


}