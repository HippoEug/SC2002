import java.util.Scanner;
public class ScannerApp 
{
	public static void main(String[] args) 
	{
		Scanner str1 = new Scanner(
			"This is SC103 course on Java programming.");
		str1.useDelimiter("course");

		while (str1.hasNext())
			System.out.println(str1.next());
	}

}


