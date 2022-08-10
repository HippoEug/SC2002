public class MatrixMultiApp
{
	public static void main(String[] args)
	{
		int[][] A = {	{1, 2, 3},
						{2, 3, -1},
						{3, -1, 2}};
		int[][] B = {	{1, 2, 3},
						{5, 7, 9},
						{9, 11, 13}};
		int[][] C = new int[3][3];
		int l, m, n;

		for (l = 0; l < 3; l++) 
		{
			for (m = 0; m < C.length; m++) 
			{
				C[l][m] = 0;
				for (n = 0; n < C[l].length; n++)
					C[l][m] += A[l][n]*B[n][m];
			}
		}
		System.out.println("The product of the arrays is: ");
		for (l = 0; l < C.length; l++) 
		{
			for (m = 0; m < C[l].length; m++)
				System.out.print(C[l][m] + " ");
			System.out.println();
		}
	}
}


