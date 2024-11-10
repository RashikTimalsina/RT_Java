
class EscapeSequences
{

	public static void main(String[] args){

	String text="Hello \"Rashik\"";			//Escape Sequence(\) is used to add anything with double quotes inside
	System.out.println(text);			//Output: Hello "Rashik"

	String path="c:\\Windows\\...";			//If we have to add backslash inside statement simply use double backslas
	System.out.println(path);			//Output: c:\Windows\...
	
	String name1="Rashik  \nTimalsina";		// \n acts as new line character
	System.out.println(name1);			//Output: Rashik Timalsina(in another line)
	
	
	String name2="Star \tBoy";			//\t adds spaces between the statements
	System.out.println(name2);			//Output: Star    Boy


	}




}