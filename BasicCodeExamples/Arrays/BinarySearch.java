import java.util.Scanner;
public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int i, searchkey, found;
		int[] numArray = new int[10];
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a list of 10 numbers: ");
		for (i = 0; i < 10; i++)
			numArray[i] = sc.nextInt();
		System.out.print("Enter integer key: ");
		searchkey = sc.nextInt();
		found = binarySearch(numArray, searchkey);
		if (found != -1)
			System.out.println("The search value is found at: " + found);
		else
			System.out.println("The search value not found.");
	}
	public static int binarySearch(int[] array, int key) 
	{
		int middle;				// mid-point 
		int first = 0;			// first position in array 
		int last = array.length-1; 	// last position in array 

		while (first <= last) {
			middle = (first + last)/2;
			if (key == array[middle])	// search key found 
				return middle; 
			else if (key < array[middle])
				last = middle - 1;
			else 
				first = middle + 1;
		} 
		return -1;				// search key not found 
	}
}


