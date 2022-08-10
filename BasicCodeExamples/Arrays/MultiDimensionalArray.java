public class MultiDimensionalArray 
{
	public static void main(String[] args) 
	{
		int[][] array =	{
						{5, 10, 15},
						{10, 20, 30},
						{20, 40, 60}
					};
		int row, column, sum;

		// Sum of rows 
		for (row = 0; row < 3; row++) 
		{
			sum = 0;
			for (column = 0; column < 3; column++)
				sum += array[row][column];
			System.out.println("The sum of elements in row " + row + " is " + sum);
		}
		// Sum of columns 
		for (column = 0; column < 3; column++) 
		{
			sum = 0;
			for (row = 0; row < 3; row++)
				sum += array[row][column];
			System.out.println("The sum of elements in column " + column + " is " + sum);
		}
	}
}


