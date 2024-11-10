class ArrayEx4 {
	// Multi Dimensional Type

	public static void main(String[] args) {

		// Declaring variables
		int x[][] = new int[2][3];

		x[0][0] = 2;
		x[0][1] = 3;
		x[0][2] = 4;
		x[1][0] = 5;
		x[1][1] = 6;
		x[1][2] = 7;
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(x[row][col]);
			}
			System.out.println();

		}
	}
}