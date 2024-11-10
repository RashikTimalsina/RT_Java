
class ParentClass
{

	int x=5;


class ChildClass
{

	int y=10;

}

class GrandChildClass
{

	int z=15;

}
	

}

class NestedClass2
{

	public static void main(String[] args)
	{

	ParentClass pc=new ParentClass();
	ParentClass.ChildClass cc=pc.new ChildClass();
	ParentClass.GrandChildClass gcc=pc.new GrandChildClass();	//ParentClass=RootClass

	System.out.println(pc.x + cc.y + gcc.z);

	}

}



