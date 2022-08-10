public class UsingCharAt 
{
	public static void main(String[] args) 
	{
		String str1 = "STAR WARD";
		int vowels = 0;
		
		System.out.println("The string is: " + str1);
		System.out.print("The reverse string is: ");
		for (int i = str1.length()-1; i>=0; i--) 
		{
			System.out.print(str1.charAt(i));
			switch (str1.charAt(i)) {
			case 'a': case 'A':
			case 'e': case 'E':
			case 'i': case 'I':
			case 'o': case 'O':
			case 'u': case 'U': vowels++;
			}
		}
		System.out.println("\nThe string has " + vowels + 
			" vowels");
	}
}


