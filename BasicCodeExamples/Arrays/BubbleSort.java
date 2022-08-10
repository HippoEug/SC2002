import java.util.Scanner;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int i, n;
		int[] number = new int[10];		// array to be sorted 
		Scanner sc = new Scanner(System.in);	
			
		System.out.print("Enter the number of items to be sorted: ");
		n = sc.nextInt();
		System.out.print("Enter the list of numbers: ");
		for (i = 0; i < n; i++)
			number[i] = sc.nextInt();
		bubble_sort(number,n);
		System.out.println("The sorted array is: ");
		for (i = 0; i < n; i++)
			System.out.print(number[i] + " ");						
	}
	public static void bubble_sort(int[] x, int n) 
	{
		int tempValue, pass, index;
		
		for (pass = 0; pass < n-1; pass++) 
		{ 
			// n-1 passes 
			for (index=0; index < n-1; index++) 
			{
				// one pass 
				if (x[index] > x[index+1]) {	// comparison 
					tempValue = x[index];	// swap process 
					x[index] = x[index+1];
					x[index+1] = tempValue;
				}
			}
		}
	}
}


