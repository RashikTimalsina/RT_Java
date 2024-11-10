class XYZ
{

	private String password;
	

	public String getPassword()
	{


	return this.password;

	}


	public void setPassword(String pass)
	{

	this.password=pass;
		
	}
	
}

class PrivateSetGetMethod
{

	public static void main(String[] args)
	{

	XYZ.x=new XYZ();
	
	x.setPassword("abcd");
	System.out.println(x.getPassword());
	




	}




}



