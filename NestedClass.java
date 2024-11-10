import java.lang.*;
class Animal					//Parent class
{

	String name="Cat";


class Cat						//Child class
{
	int age=6;


}


}


class NestedClass					//Main class
{

	public static void main(String[] args)
	{

	Animal a=new Animal();
	Animal.Cat c=a.new Cat();
		
	System.out.println(a.name + " " +c.age);

	}


}