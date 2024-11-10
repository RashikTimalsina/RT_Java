import java.lang.*;
class UnaryOperator2
{


	public static void main(String[] args)
	{


	int a=10;
	int b=5;
	
	int c= a+b;
	int d=a-b;
	
	System.out.println(a++ + ++a);				//10 + 12=22
	System.out.println(b-- - --b);				//5 -3=2
	
	System.out.println(c++);				//15 dekahuxa but actual ma vako hunxa 16(15+1)
	System.out.println(++c);				//16 ma 1 add vayerw 17 dekahuxa

	System.out.println(d--);				//5 dekahuxa but actual ma vako hunxa 4 (5-1)
	System.out.println(--d);				//4 ma 1 minus vayerw 3 dekahux




	}





}