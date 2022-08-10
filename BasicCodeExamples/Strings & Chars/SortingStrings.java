import java.util.Scanner;
public class SortingStrings 
{
	private String[] stringNames;
	Scanner sc = new Scanner(System.in);

	public void readStrings()
	{
		stringNames = new String[5];
		for (int i = 0; i <  5; i++) 
		{
			System.out.print ("Enter names to be sorted: ");
			stringNames[i] = sc.nextLine();
		}
	}
	public void displayStrings()
	{
		for (int i = 0; i < 5; i++)
			System.out.println(stringNames[i]);
	}
	public void sortStrings()
	{
		int i, j;
		String temp;
		for (i=0; i < stringNames.length-1; i++)
			for (j=0; j < stringNames.length-1; j++)
				if (stringNames[j].compareTo(stringNames[j+1]) > 0)
				{
					temp = stringNames[j];
					stringNames[j] = stringNames[j+1];
					stringNames[j+1] = temp;
				}
	}

}


