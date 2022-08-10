public class ConcatStrings 
{
	public static void main(String[] args) 
	{
		String str1 = "Problem ";
		String str2 = "Solving";

		System.out.println("The first string: " + str1);
		System.out.println("The second string: " + str2);
		String str3 = str1.concat(str2);
		System.out.println("The combined string: " + str3);
	}
}


