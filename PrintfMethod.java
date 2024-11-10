

class PrintfMethod {

	// printf( )=an optional method to control,format and display text to the
	// console window
	// two arguments = format string + (object/variable/value)
	// % [flags] [precision] [width] [conversion-character]

	public static void main(String[] args) {

		boolean myBoolean = true;
		char myChar = 'M';
		String myString = "Rashik";
		int myInt = 19;
		double myDouble = 5.6;

		[conversion-character]
		System.out.printf("%b ",myBoolean);
		System.out.printf("%c ",myChar);
		System.out.printf("%s ",myString);
		System.out.printf("%d ",myInt);
		System.out.printf("%f ",myDouble);

		// [width]
		// minimum number of characters to be written as output
		// System.out.printf("Hello %10s ",myString);

		// [precision]
		// sets number of digits of precision when outputting floating-point values
		// System.out.printf("Your height is %.2f ",myDouble);

		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric vlaue
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000

		// System.out.printf("My age is %-d ",myInt);
		// System.out.printf("My age is %+d ",myInt);
		// System.out.printf("My age is %0d ",myInt);
		// System.out.printf("My age is %,d ",myInt);

	}

}