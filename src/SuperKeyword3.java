import java.lang.*;
class Animal
{

	Animal()					//Parent constructor
	{

	System.out.println("Animal is created ");

	}
	
	
}

class Cat extends Animal
{

	Cat()					//Child constructor
	{
	
	super();					//this will invoke/call the parent body i.e "Animal is created"
			
	}


}

class SuperKeyword3
{

	public static void main(String[] args)
	{

	Cat cat=new Cat();				//Will call the constructor inside the Cat class i.e super(); 

	}



}