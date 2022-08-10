public class SortStringsApp 
{
	public static void main(String[] args) 
	{
		SortingStrings inputStrings = new SortingStrings();
		inputStrings.readStrings();
		System.out.println("Before sorting: ");
		inputStrings.displayStrings();
		inputStrings.sortStrings();
		System.out.println("After sorting: ");
		inputStrings.displayStrings();
	}

}


