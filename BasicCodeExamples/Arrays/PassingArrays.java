import java.util.Scanner;
public class PassingArrays 
{
	public static void main(String[] args) 
	{
	int maxValue, index, n;
	int[] numArray = new int[10];
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the number of values: ");
	n = sc.nextInt();
	System.out.print("Enter the values: ");
	for (index = 0; index < n; index++)
		numArray[index] = sc.nextInt();
	maxValue = maximum(numArray, n);
	System.out.println("The maximum value is " + maxValue);
	}
	public static int maximum(int[] table, int num) 
	{
		int i, max;

		max = table[0];
		for (i = 1; i < num; i++)
			if (table[i] > max)
				max = table[i];
		return max;
	}
}


