public class ExtractSubstring 
{
	public static void main(String[] args) 
	{
		String str = "Java Programming";
		System.out.println("str = " + str);
		System.out.println("str.substring(0) = " + str.substring(0));
		System.out.println("str.substring(0, 4) = " + str.substring(0, 4));
		System.out.println("str.substring(5, str.length()) = " + str.substring(5, str.length()));
	}
}


