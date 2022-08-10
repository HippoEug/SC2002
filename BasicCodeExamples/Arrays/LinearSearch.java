import java.util.Scanner;
public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int i, searchkey, found;
		int[] numArray = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a list of 10 numbers: ");
		for (i = 0; i < 10; i++)
			numArray[i] = sc.nextInt();
		System.out.print("Enter integer key to be searched: ");
		searchkey = sc.nextInt();
		found = linearSearch(numArray, searchkey);
		if (found != -1)
			System.out.println("The search value is found at: " + found);
		else
			System.out.println("The search value not found.");
	}
	public static int linearSearch(int[] array, int key)
	{
		int index;
		for (index = 0; index < array.length; index++) 
			if (array[index] == key)
				return index;
		return -1;
	}
}


