import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizer2 
{
	public static void main(String[] args) 
	{
		String inputString, aString;
		int total=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your number strings: ");
		inputString = sc.nextLine();
		StringTokenizer str = new StringTokenizer(inputString);	
		System.out.println("countTokens() = " + str.countTokens());
		while (str.hasMoreTokens()) 
		{
			aString = str.nextToken();
			System.out.println(aString);
			total += Integer.parseInt(aString);
		}
		System.out.println("The total is " + total);
	}

}

