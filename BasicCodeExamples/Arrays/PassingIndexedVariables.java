import java.util.Scanner;
public class PassingIndexedVariables 
{
	public static void main(String[] args)
	{
		final int MAX_INPUT=10;
		int index, max;
		int[] numArray = new int[10];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 10 numbers: ");
		for (index = 0; index < MAX_INPUT; index++)
			numArray[index] = sc.nextInt();
		max = numArray[0];
		for (index = 1; index < MAX_INPUT; index++)
			max = larger(max, numArray[index]);
		System.out.println("The maximum value is " + max);
	}
	public static int larger(int first, int second) 
	{
		if (first > second)
			return first;
		else
			return second;
	}

}


