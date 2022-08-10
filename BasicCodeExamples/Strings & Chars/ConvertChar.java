public class ConvertChar 
{
	public static void main(String[] args)
	{
		int i;
		char nextChar;
		String str = "Introduction to Java Programming";

		System.out.println("The string is: " + str);
		System.out.print("The new string is: ");
		for (i=0; i<str.length(); i++)
		{
			nextChar = str.charAt(i);
			if (Character.isUpperCase(nextChar))
				nextChar = Character.toLowerCase(nextChar);
			else if (Character.isLowerCase(nextChar))
				nextChar = Character.toUpperCase(nextChar);
			System.out.print(nextChar);
		}

		System.out.println();
	}
}


