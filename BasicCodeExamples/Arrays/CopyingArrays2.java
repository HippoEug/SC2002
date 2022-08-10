public class CopyingArrays2 
{
	public static void main(String[] args)
	{
		int index;
		int[] array1 = {1, 3, 5, 7, 9};
		int[] array2 = new int[5];

		System.arraycopy(array1, 0, array2, 1, 4);
		
		System.out.print("Array 1: ");
		printArray(array1);
		System.out.print("Array 2: ");
		printArray(array2);
	}
	public static void printArray(int[] table) 
	{
		for (int i = 0; i < table.length; i++)
			System.out.print(table[i] + " ");
		System.out.println();
	}
}


