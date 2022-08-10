public class MultiDiArraysApp 
{
	public static void main(String[] args)
	{
		int[][] array = {
						{5, 10, 15},
						{10, 20, 30},
						{20, 40, 60}
						};
		int totalRow, totalColumn;
		totalRow = sumOfRows(array);
		totalColumn = sumOfColumns(array);
		System.out.println("Sum of all elements in rows is " + totalRow);
		System.out.println("Sum of all elements in columns is " + totalColumn);
	}
	public static int sumOfRows(int[][] ar) 
	{
		int row, column;
		int sum=0;
		for (row = 0; row < ar.length; row++) 
		{
			for (column = 0; column < ar[row].length; column++)
				sum += ar[row][column];
		}
		return sum;
	}
	public static int sumOfColumns(int[][] ar) 
	{
		int row, column;
		int sum=0;
		for (column = 0; column < ar.length; column++)
		{
			for (row = 0; row < ar[0].length; row++)
				sum += ar[row][column];
		}
		return sum;
	}
}


